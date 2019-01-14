package com.skillindia.dao;

import java.util.List;

import com.skillindia.model.Candidate;
import com.skillindia.model.Courses;

public interface CandidateDao {
	public void addCandidate(Candidate p);//insert
	public void updateCandidate(Candidate p);//update/modify
	public List<Courses> browseCourse(String searchQuery);//displaying courses matching query result
	public void applyForCourse(String courseName);//applying for selected course..
	public void removeCandidate(String candidateName);//delete/remove
	public Candidate getCandidateByName(String candidateName);

}
