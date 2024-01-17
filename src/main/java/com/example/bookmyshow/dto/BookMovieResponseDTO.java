package com.example.bookmyshow.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookMovieResponseDTO {
	private Long BookingId;
	private ResponseStatus responseStatus;
	private int amount;
}
