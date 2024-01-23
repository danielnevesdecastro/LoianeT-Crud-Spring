package com.br.crud;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.br.crud.model.Course;
import com.br.crud.repository.CourseRepository;

@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);
	}
	
	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args ->{
			courseRepository.deleteAll();
			
			Course c = new Course();
			c.setName("Angular com Spring ");
			c.setCategory("front-end");
			
			courseRepository.save(c);
		};
	}
}
