package com.adnanhakim.courseapi.api;

import com.adnanhakim.courseapi.model.Course;
import com.adnanhakim.courseapi.model.Topic;
import com.adnanhakim.courseapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/topic/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id) {
        return courseService.getAllCourses(id);
    }

    @GetMapping("/topic/{topicId}/courses/{id}")
    public Course getCourseById(@PathVariable String id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("/topic/{topicId}/courses")
    public void addCourse(@PathVariable String topicId, @RequestBody Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.addCourse(course);
    }

    @PutMapping("/topic/{topicId}/courses/{id}")
    public void updateCourseById(@PathVariable String topicId, @PathVariable String id, @RequestBody Course course) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.updateCourseById(course);
    }

    @DeleteMapping("/topic/{topicId}/courses/{id}")
    public void deleteCourseById(@PathVariable String id) {
        courseService.deleteCourseById(id);
    }
}
