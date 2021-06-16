package com.spring.rpm.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.spring.rpm.model.Vendor;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
 class VendorServiceImplTest 
{
	@Autowired
	VendorService vendorService;
	@MockBean
	VendorService vendorServiceTemp;
	@Test
	 void findVendorById()
	{
		Vendor vendor = new Vendor(2, "Amazon", 30.5, 5.0);
		long vendorId = 1;
		when(vendorServiceTemp.getVendoreById(vendorId)).thenReturn(vendor);
		assertEquals(vendorService.getVendoreById(vendorId), vendor);
	}

}
