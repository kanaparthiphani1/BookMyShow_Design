package com.example.bookmyshow.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.bookmyshow.dto.BookMovieRequestDTO;
import com.example.bookmyshow.dto.BookMovieResponseDTO;
import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.services.BookingService;

@Controller
public class BookingController {
	
	private BookingService bookingService;
	
	@Autowired
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
		
	}

	public BookMovieResponseDTO bookMovie(BookMovieRequestDTO bookingReq) {
		Booking booking = bookingService.bookMovie(bookingReq.getShowId(),bookingReq.getUserId(), bookingReq.getShowSeatIds());
		return null;
	}
}
