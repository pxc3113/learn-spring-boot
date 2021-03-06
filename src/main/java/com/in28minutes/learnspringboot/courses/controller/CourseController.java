package com.in28minutes.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import com.in28minutes.learnspringboot.courses.bean.Course;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(new Course(1, "Learn Micro", "in28"));
    }
}
