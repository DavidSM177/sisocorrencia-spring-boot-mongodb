package com.dmti.sgroe.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.dmti.sgroe.domain.User;
import com.dmti.sgroe.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userReposiroty;

	@Override
	public void run(String... args) throws Exception {
		
		userReposiroty.deleteAll();
		
		User jhon = new User(null, "Jhon scuber", "Jhon.scuber@gmail.com");
		User frederic = new User(null, "Frederic marata", "Frederic@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userReposiroty.saveAll(Arrays.asList(jhon, frederic, bob));
		
		
	}

}
