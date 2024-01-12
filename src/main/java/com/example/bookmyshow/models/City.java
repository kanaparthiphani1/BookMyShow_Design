package com.example.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class City extends BaseModel {
	private String name;
	private List<Theatre> theatres; 
}
