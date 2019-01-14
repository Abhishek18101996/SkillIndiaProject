package com.skillindia.service;

import java.util.List;


import com.skillindia.dao.CourseDao;

public class CourseServiceImpl implements CourseService {

	private CourseDao course;
	@Override
	public void addCourse(CourseDao p) {
		course.addCourse(p);
		
	}

	@Override
	public void updateCourse(CourseDao p) {
	course.updateCourse(p);
		
	}

	@Override
	public List<CourseDao> listCourses() {
		return course.listCourses();
	}

	@Override
	public void removeCourse(String name) {
		course.removeCourse(name);
		
	}
	

}
