package com.skillindia.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.skillindia.model.Candidate;
import com.skillindia.model.Courses;


@Service
public interface CandidateService {
			public void addCandidate(Candidate candidate);//insert
			public void updateCandidate(Candidate candidate);//update/modify
			public void removeCandidate(String name);//delete/remove
			public List<Courses> browseCourse(String searchQuery);//displaying courses matching query result
			public void applyForCourse(String courseName);//applying for selected course..
			public Candidate getCandidateByName(String candidateName);
}


