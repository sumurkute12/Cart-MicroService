package com.spring.rpm.service;


import com.spring.rpm.model.Vendor;

public interface VendorService {
	
	public Vendor saveVendore(Vendor vendore);
	public Vendor getVendoreById(long vendoreId);
	
}
