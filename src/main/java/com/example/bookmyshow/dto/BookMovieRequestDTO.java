package com.example.bookmyshow.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookMovieRequestDTO {
	
	private List<Long> showSeatIds;
	private Long showId;
	private Long userId; 

}
