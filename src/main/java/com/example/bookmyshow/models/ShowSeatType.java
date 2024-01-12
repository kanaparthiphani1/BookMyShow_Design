package com.example.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public class ShowSeatType extends BaseModel {
	private Show show;
	private SeatType type;
	private int price;
}
