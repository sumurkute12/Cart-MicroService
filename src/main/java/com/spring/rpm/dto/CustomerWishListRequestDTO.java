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
@AllArgsConstructor
@NoArgsConstructor
public class CustomerWishListRequestDTO {


	private long customerId;
	private long productId;
	private int quantity;	

}
