package com.spring.rpm.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendorData {

	private long vendorId;
	private String vendorName;
	private double deliveryCharge;
	private double rating;
	
}
