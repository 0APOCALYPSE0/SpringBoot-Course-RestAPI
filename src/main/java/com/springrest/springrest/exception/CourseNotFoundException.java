package com.springrest.springrest.exception;

public class CourseNotFoundException extends RuntimeException {
	public CourseNotFoundException(String message) {
		super(message);
	}
}
