package com.example.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmyshow.models.ShowSeat;

public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

}
