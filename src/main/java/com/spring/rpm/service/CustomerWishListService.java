package com.spring.rpm.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.rpm.dto.CustomerWishListDTO;
import com.spring.rpm.dto.CustomerWishListRequestDTO;
import com.spring.rpm.dto.StatusDTO;
import com.spring.rpm.model.CustomerWishList;
import com.spring.rpm.model.Product;
import com.spring.rpm.repository.CustomerWishListRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerWishListService {

	@Autowired
	CustomerWishListRepo customerRepo;
	@Autowired
	private ProductService productService;

	@Transactional
	public StatusDTO save(CustomerWishListRequestDTO customerWishRequest) {
		log.info("wishlish call save starts");
		CustomerWishList wish = new CustomerWishList(customerWishRequest.getProductId(),
				customerWishRequest.getQuantity(), LocalDate.now(), customerWishRequest.getCustomerId());
		CustomerWishList wishTemp = customerRepo.exists(customerWishRequest.getCustomerId(), customerWishRequest.getProductId());
		if (wishTemp != null) {
			wishTemp.setQuantity(wishTemp.getQuantity() + customerWishRequest.getQuantity());
			wish=wishTemp;
		}
		customerRepo.save(wish);
		log.info("saved details to wishlist successfully");
		return new StatusDTO("SuccessFully Added to WishList");
		
	}


	@Transactional
	public List<CustomerWishListDTO> getCartDetails(long customerId) {
		log.info("get wishlist service method starts");
		List<CustomerWishListDTO> list = new ArrayList<>();
		for (CustomerWishList wish : customerRepo.getCustomerListById(customerId)) {
			Product product = productService.getProductbyId(wish.getProductId());
			list.add(new CustomerWishListDTO(wish.getWishListId(), wish.getQuantity(), wish.getAddedToWishlistDate(),
					wish.getCustomerId(), product));
			log.info("wishlist are returned of customer id"+customerId);
		}
		return list;
	}

}
