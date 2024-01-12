package com.example.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public class ShowSeat extends BaseModel{
	private Show show;
	private Seat seat;
	private ShowSeatStatus status;

}
