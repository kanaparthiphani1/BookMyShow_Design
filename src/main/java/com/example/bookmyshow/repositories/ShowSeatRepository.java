package com.example.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.models.ShowSeat;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

}
