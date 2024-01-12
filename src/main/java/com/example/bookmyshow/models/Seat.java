package com.example.bookmyshow.models;

import jakarta.persistence.Entity;

@Entity
public class Seat extends BaseModel {
	private String seatNum;
	private int row;
	private int col;
	private SeatType seatType;
}
