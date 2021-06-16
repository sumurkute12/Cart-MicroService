package com.spring.rpm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.rpm.model.CustomerWishList;



public interface CustomerWishListRepo extends JpaRepository<CustomerWishList, Long>{
	@Query("from CustomerWishList c where c.customerId=:customerId")
	public List<CustomerWishList> getCustomerListById(long customerId);
	@Query("from CustomerWishList c where c.customerId=:customerId and c.productId=:productId")
	public CustomerWishList exists(long customerId, long productId);
	
}
