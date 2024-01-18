package com.example.bookmyshow.services;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.models.Booking;
import com.example.bookmyshow.models.BookingStatus;
import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeat;
import com.example.bookmyshow.models.ShowSeatStatus;
import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.BookingRepository;
import com.example.bookmyshow.repositories.ShowRepository;
import com.example.bookmyshow.repositories.ShowSeatRepository;
import com.example.bookmyshow.repositories.UserRepository;

@Service
public class BookingService {
	
	private BookingRepository bookingRepository;
	private ShowSeatRepository showSeatRepository;
	private UserRepository userRepository;
	private ShowRepository showRepository;
	private PriceCalculator priceCalculator;
	
	@Autowired
	public BookingService(BookingRepository bookingRepository, ShowSeatRepository showSeatRepository,
			UserRepository userRepository, ShowRepository showRepository, PriceCalculator priceCalculator) {
		super();
		this.bookingRepository = bookingRepository;
		this.showSeatRepository = showSeatRepository;
		this.userRepository = userRepository;
		this.showRepository = showRepository;
		this.priceCalculator = priceCalculator;
	}



	public Booking bookMovie(Long showId, Long userId, List<Long> showSeatIds) {
		//get User
		//check user is there or not
		// get showSeats
		// check all are available or not
		// if anyone is not available throw error
		// if available make them BLOCKED and save it to DB
		// create a Booking out of it and send back to controller
		
		Optional<User> user = userRepository.findById(userId);
		if(user.isEmpty()) {
			throw new Error("No User FOund");
		}
		
		User bookedBy = user.get();
		
		Optional<Show> show = showRepository.findById(showId);
		if(show.isEmpty()) {
			throw new Error("No SHow found");
			}
		
		List<ShowSeat> showSeat = showSeatRepository.findAllById(showSeatIds);
		
		for(ShowSeat obj:showSeat) {
			if(!(obj.getStatus().equals(ShowSeatStatus.AVAILABLE) || (obj.getStatus().equals(ShowSeatStatus.BLOCKED) && Duration.between(obj.getBlockedAt().toInstant() , new Date().toInstant()).toMinutes() > 15) )) {
				throw new Error("Some seats are occupied");
			}
		}
		
		List<ShowSeat> showSeatSaved = new ArrayList<>();
		for(ShowSeat obj:showSeat) {
			obj.setStatus(ShowSeatStatus.BLOCKED);
			obj.setBlockedAt(new Date());
			obj.setModifiedAt(new Date());
			obj.setShow(show.get());
			showSeatSaved.add(showSeatRepository.save(obj));
		}
		
		Booking booking= new Booking();
		booking.setSeats(showSeatSaved);
		booking.setUser(bookedBy);
		booking.setBookedAt(new Date());
		booking.setBookingStatus(BookingStatus.PENDING);
		booking.setShow(show.get());
		booking.setAmount(priceCalculator.calculateAmount(showSeatSaved, show.get()));

		bookingRepository.save(booking);
		
		return booking;
	}
}
