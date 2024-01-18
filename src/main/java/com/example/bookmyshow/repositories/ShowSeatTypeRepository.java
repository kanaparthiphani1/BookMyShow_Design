package com.example.bookmyshow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.models.Show;
import com.example.bookmyshow.models.ShowSeatType;

@Repository
public interface ShowSeatTypeRepository extends JpaRepository<ShowSeatType, Long>{

	@Query
	List<ShowSeatType> findByShow(Show show);
}
