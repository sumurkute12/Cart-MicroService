package com.spring.rpm.dto;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

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
public class CartDTO {
	
		private long cartId;
		private long productId;
		private String zipcode;
		@DateTimeFormat(pattern = "yyyy-MM-dd")
		private LocalDate deliveryDate;
		private long vendoreId;
		private long customerId;
		private long quantity;
	}
	
	
	

