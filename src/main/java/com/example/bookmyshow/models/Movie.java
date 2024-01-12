package com.example.bookmyshow.models;

import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends BaseModel{
	private String name;
	
	@Enumerated(EnumType.ORDINAL)
	@ElementCollection
	private List<Feature> features;
	private int duration;
	
	@Enumerated(EnumType.ORDINAL)
	private Genre genre;
}
