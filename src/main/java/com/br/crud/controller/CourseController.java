package com.br.crud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.crud.model.Course;
import com.br.crud.repository.CourseRepository;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
	
	
	private final CourseRepository courseRepository;
	
	
	
	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}



	@GetMapping
	public List<Course> list (){
		return courseRepository.findAll();
	}
	
}
