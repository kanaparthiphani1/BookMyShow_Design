package com.example.bookmyshow.models;

import java.util.List;

public class Movie extends BaseModel{
	private String name;
	private List<Feature> features;
	private int duration;
	private Genre genre;
}
