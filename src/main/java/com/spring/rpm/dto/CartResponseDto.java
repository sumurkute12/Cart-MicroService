package com.spring.rpm.dto;

import java.time.LocalDate;


import com.spring.rpm.model.Product;
import com.spring.rpm.model.Vendor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Swapnil,Rishav,Amit,Siddhi
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponseDto {
	private long cartId;	
	private String zipCode;
	private LocalDate deliveryDate;
	private long customerId;
	private long quantity;
	private Product product;
	private Vendor vendor;
}

