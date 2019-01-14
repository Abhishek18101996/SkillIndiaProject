package com.skillindia.dao;

import java.util.List;

public interface CourseDao {

	public void addCourse(CourseDao p);//insert
	public void updateCourse(CourseDao p);//update/modify
	public List<CourseDao> listCourses();//retrieve/listAll
	public void removeCourse(String  name);//delete/remove
	
}
