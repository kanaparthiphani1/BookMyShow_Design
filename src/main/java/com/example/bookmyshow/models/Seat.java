package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel {
	private String seatNum;
	private int row;
	private int col;
	
	// S : ST
	// 1 : 1
	// N : 1
	@ManyToOne
	private SeatType seatType;
}
