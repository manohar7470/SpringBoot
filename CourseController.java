package com.code.springboot.learnspringboot;
//file inside main java package - getter setter method
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	@RequestMapping("/courses")
	public List<Course> retreiveAllCourses(){
		return Arrays.asList(
				new Course(1,"Learn SpringBoot", "in21minutes"),
				new Course(2,"Learn AWS Genesyss", "in21minutes"),
				new Course(3,"Learn JNDI", "in21minutes")
				//new Course(3,"Learn Microservices", "in21minutes")
				
				);
	}

}
