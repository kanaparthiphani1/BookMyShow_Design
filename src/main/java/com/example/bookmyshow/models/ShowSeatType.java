package com.example.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends BaseModel {
	
	// SST : Sh
	// 1   : 1
	// M   : 1
	@ManyToOne
	private Show show;
	
	@ManyToOne
	private SeatType type;
	private int price;
}
