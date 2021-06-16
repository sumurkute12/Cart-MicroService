package com.spring.rpm.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 
 * @author Swapnil,Rishav,Amit,Siddhi
 *
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartRequestDto {
		private long productId;
		private long customerId;
		private String zipcode;
		private long quantity;
	}
	
	
	

