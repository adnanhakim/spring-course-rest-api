package com.adnanhakim.courseapi.service;

import com.adnanhakim.courseapi.dao.CourseRepository;
import com.adnanhakim.courseapi.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(String id) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll()
                .forEach(courses::add);
        return courses;
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id).orElse(null);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourseById(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourseById(String id) {
        courseRepository.deleteById(id);
    }
}
