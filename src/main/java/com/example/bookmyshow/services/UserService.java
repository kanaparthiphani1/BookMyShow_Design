package com.example.bookmyshow.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.models.User;
import com.example.bookmyshow.repositories.UserRepository;

@Service
public class UserService {
	private UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    
    public User signUp(String email, String password){
    	Optional<User> userOptional = userRepository.findByEmail(email);
        if(userOptional.isPresent()){
            throw new RuntimeException("User already exists");
        }

        User user = new User();
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode(password));
        user.setEmail(email);
        user.setBookings(new ArrayList<>());

        user = userRepository.save(user);
        return user;
    }
    
    public User logIn(String email, String password){
    	 Optional<User> userOptional = userRepository.findByEmail(email);
         if(userOptional.isEmpty()){
             throw new RuntimeException("No user with the given Email!");
         }
         User user = userOptional.get();
         BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
         if(bCryptPasswordEncoder.matches(password,user.getPassword())){
             return user;
         }
         throw new RuntimeException("Invalid password!");
    }
}
