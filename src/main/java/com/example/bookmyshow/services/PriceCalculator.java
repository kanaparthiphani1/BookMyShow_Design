package com.example.bookmyshow.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.ShowSeatType;
import com.example.bookmyshow.repositories.ShowSeatTypeRepository;

@Service
public class PriceCalculator{
	
	private ShowSeatTypeRepository showSeatTypeRepository;
	
	@Autowired
	public PriceCalculator(ShowSeatTypeRepository showSeatTypeRepository) {
		this.showSeatTypeRepository = showSeatTypeRepository;
	}

	public int calculateAmount(List<ShowSeat> showSeats, Show show) {
		HashMap<String,Integer> showSeatPrices = new HashMap<>();
		List<ShowSeatType> showSeatTypes = showSeatTypeRepository.findByShow(show);
		for(ShowSeatType showSeatType: showSeatTypes) {
			if(!showSeatPrices.containsKey(showSeatType.getType())) {
				showSeatPrices.put(showSeatType.getType().getName(), showSeatType.getPrice());
				
			}
		}
		
		int amount = 0;
		for(ShowSeat showSeat:showSeats) {
			amount = amount + showSeatPrices.get(showSeat.getSeat().getSeatType().getName());
			
		}
		return amount;
	}

}
