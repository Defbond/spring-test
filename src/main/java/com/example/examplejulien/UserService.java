package com.example.examplejulien;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService  {
	 @Autowired
	    private RestRepository userRepository;
	 
	 public Long count() {

	        return userRepository.count();
	    }

	    public void deleteById(Long userId) {

	    	userRepository.deleteById(userId);
	    }
}
