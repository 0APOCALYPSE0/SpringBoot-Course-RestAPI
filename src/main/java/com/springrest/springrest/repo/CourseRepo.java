package com.springrest.springrest.repo;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.model.Course;

public interface CourseRepo extends JpaRepository<Course, Long>{
	
	Optional<Course> findCourseById(Long id);
}