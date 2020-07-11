package com.example.spring.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	private List<Student> studentRecords;
	private static StudentRegistration stdregd = null;  
	
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}

}
