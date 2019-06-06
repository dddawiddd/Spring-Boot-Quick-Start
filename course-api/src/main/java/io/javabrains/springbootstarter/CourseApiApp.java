package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    //this annotation tells spring-boot that it is starting point for application
public class CourseApiApp {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApp.class, args);
	

	}

}
