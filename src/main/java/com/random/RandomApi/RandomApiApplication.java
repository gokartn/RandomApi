package com.random.RandomApi;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RandomApiApplication.class, args);
                Server.getInstance().generateData();
	}
}
