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
public class ShowSeat extends BaseModel{
	
	// Ss : Sh
	// 1  : 1
	// M  : 1
	@ManyToOne
	private Show show;
	
	// Ss : Se
	// 1  : 1
	// M  : 1
	@ManyToOne
	private Seat seat;
	
	@Enumerated(EnumType.ORDINAL)
	private ShowSeatStatus status;

}
