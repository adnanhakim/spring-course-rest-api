package com.adnanhakim.courseapi.dao;

import com.adnanhakim.courseapi.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
}
