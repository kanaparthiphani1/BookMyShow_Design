package com.example.bookmyshow.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{
	// B : S
	// 1 : M
	// M  : 1 (One seat can be with 2 booking but one of booking status 
	//should be cancelled and there should be one successful booking)
	
	@ManyToMany
	private List<ShowSeat> seats;
	
	@ManyToOne
	private Show show;
	
	@ManyToOne
	private User user;
	
	private Date bookedAt;
	
	private int amount;
	
	@Enumerated(EnumType.ORDINAL)
	private BookingStatus bookingStatus;
	
	@OneToMany
	private List<Payment> payments;
}
