package com.example.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class Theatre extends BaseModel{
	private String name;
	private City city;
	private List<Screen> screens;
	
}
