package com.spring.rpm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.spring.rpm.model.Product;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class ProductService {

	@Autowired
	private RestTemplate rt;	
	
	
	 public Product getProductbyId(long productId) {	
		 log.info("call made to product microservice for Product of id:"+productId);
		 return rt.getForObject("http://product-service/product/productById/"+productId, Product.class);
		 
	 } 
	
	
}
