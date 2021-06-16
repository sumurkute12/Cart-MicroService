package com.spring.rpm.service;

import java.util.List;
import com.spring.rpm.dto.CartRequestDto;
import com.spring.rpm.dto.CartResponseDto;
import com.spring.rpm.model.Vendor;

public interface CartService {
	
	public String addToCart(CartRequestDto cartRequestDto);
	public List<CartResponseDto> getCartList(long customerId);
	public boolean isVendorEmpty(Vendor vendor);
	
	
}
