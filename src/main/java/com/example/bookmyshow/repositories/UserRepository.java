package com.example.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bookmyshow.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
