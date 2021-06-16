package com.spring.rpm.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long cartId;
	private long productId;
	private String zipcode;
	private LocalDate deliveryDate;
	private long vendoreId;
	private long customerId;
	private long quantity;
	public Cart(long productId, String zipcode, LocalDate deliveryDate, long vendoreId, long customerId,
			long quantity) {
		super();
		this.productId = productId;
		this.zipcode = zipcode;
		this.deliveryDate = deliveryDate;
		this.vendoreId = vendoreId;
		this.customerId = customerId;
		this.quantity = quantity;
	}


}
