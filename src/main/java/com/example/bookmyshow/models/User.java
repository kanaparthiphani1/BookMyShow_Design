package com.example.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
	private String name;
	private String email;
	@OneToMany
	private List<Booking> bookings;
	private String password;
}
