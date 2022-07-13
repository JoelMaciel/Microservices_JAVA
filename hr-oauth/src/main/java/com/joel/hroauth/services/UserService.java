package com.joel.hroauth.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.hroauth.entities.User;
import com.joel.hroauth.feingClients.UserFeingClient;

@Service
public class UserService {
	
	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeingClient userFeingClient;
	
	public User findByEmail(String email) {
		User user = userFeingClient.findByEmail(email).getBody();
		if(user == null) {
			logger.error("Email not found" + email);
			throw new IllegalArgumentException("Email not foud");
		}
		logger.info("Email found : " + email);
		return user;
	}

}
