package com.example.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public class Payment extends BaseModel {
	private Booking booking;
	private String refNo;
	private PaymentStatus paymentStatus;
    private PaymentProvider paymentProvider;
	
}
