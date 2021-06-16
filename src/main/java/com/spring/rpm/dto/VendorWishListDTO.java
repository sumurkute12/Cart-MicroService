package com.spring.rpm.dto;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorWishListDTO {

	
	
	private long customerId;
	private long productId;
	private int quantity;	
	private long vendorId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate addedToWishlistDate;
	
		
	
}
