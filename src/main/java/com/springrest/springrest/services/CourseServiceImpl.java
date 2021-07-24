package com.springrest.springrest.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springrest.springrest.exception.CourseNotFoundException;
import com.springrest.springrest.model.Course;
import com.springrest.springrest.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepo courseRepo;

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return this.courseRepo.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		return this.courseRepo.findCourseById(courseId).orElseThrow(() -> new CourseNotFoundException("Course by id "+ courseId + " was not found"));
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return this.courseRepo.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return this.courseRepo.save(course);
	}

	@Override
	public void deleteCourse(long courseId) {
		// TODO Auto-generated method stub
		Course course = this.courseRepo.findCourseById(courseId).orElseThrow(() -> new CourseNotFoundException("Course by id "+ courseId + " was not found"));
		this.courseRepo.delete(course);
	}

}
