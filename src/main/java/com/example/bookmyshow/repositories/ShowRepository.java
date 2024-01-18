package com.example.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.models.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long>{

}
