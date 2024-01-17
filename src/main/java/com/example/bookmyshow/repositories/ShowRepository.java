package com.example.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmyshow.models.Show;

public interface ShowRepository extends JpaRepository<Show, Long>{

}
