package com.spring.rpm.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import com.spring.rpm.model.Product;

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
public class CustomerWishListDTO {
	
	private long wishListId;
	private int quantity;	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate addedToWishlistDate;
	private long customerId;
	private Product product;
		

		
	
}
