package com.skillindia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skillindia.dao.CourseDao;


@Service
public interface CourseService {
	public void addCourse(CourseDao p);//insert
	public void updateCourse(CourseDao p);//update/modify
	public List<CourseDao> listCourses();//retrieve/listAll
	public void removeCourse(String  name);//delete/remove
}
