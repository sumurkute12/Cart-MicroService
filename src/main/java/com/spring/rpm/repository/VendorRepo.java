package com.spring.rpm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.rpm.model.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Long>{

	
}
