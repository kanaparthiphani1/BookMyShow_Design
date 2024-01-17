package com.example.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmyshow.models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long>{

}
