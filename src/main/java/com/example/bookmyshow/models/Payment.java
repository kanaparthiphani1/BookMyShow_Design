package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
	// P : B
	// 1 : 1
	// N : 1
//	@ManyToOne
//	private Booking booking;
	
	private String refNo;
	
	@Enumerated(EnumType.ORDINAL)
	private PaymentStatus paymentStatus;
    
	@Enumerated(EnumType.ORDINAL)
	private PaymentProvider paymentProvider;
	
}
