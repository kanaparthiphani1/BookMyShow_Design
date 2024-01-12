package com.example.bookmyshow.models;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class User {
	private String name;
	private String email;
	private List<Booking> bookings;
	private String password;
}
