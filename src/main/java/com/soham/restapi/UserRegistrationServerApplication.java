package com.soham.restapi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserRegistrationServerApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("App is start...!");
	}

}
