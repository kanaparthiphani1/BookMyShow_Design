package com.example.bookmyshow.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show extends BaseModel {
	// S : M
	// 1 : 1
	// N : 1
	@ManyToOne
	private Movie movie;

	private Date startTime;
	
	private Date endTime;
	
	// S : Sc
	// 1 : 1
	// N : 1
	@ManyToOne
	private Screen screen;
	
	@Enumerated(EnumType.ORDINAL)
	private ShowStatus status;
	
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection
	private List<Feature> features;

}
