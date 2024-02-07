package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamportalApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamportalApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Strting code");
		
	}

	

}
