package com.example.bookmyshow.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Booking extends BaseModel{
	private List<ShowSeat> seats;
	private Show show;
	private User user;
	private Date bookedAt;
	private int amount;
}
