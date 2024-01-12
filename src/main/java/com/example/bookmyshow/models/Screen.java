package com.example.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Screen extends BaseModel {
	private String name;
	private List<Seat> seats;
	private List<Feature> features;
	
}
