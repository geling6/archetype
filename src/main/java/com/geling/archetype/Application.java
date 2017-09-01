package com.geling.archetype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		
		System.setProperty("spring.devtools.remote.debug.local-port", "38000");
		
		SpringApplication.run(Application.class, args);
	}
}
