package com.example.spring.beans;

import java.util.ArrayList;
import java.util.List;

public class StudentRegistration {
	private List<Student> studentRecords;
	private static StudentRegistration stdregd = null;  
	
	private StudentRegistration() {
		studentRecords = new ArrayList<Student>();
	}
	public static StudentRegistration getInstance() {
		if (stdregd == null) {
			stdregd = new StudentRegistration();
			return stdregd;
		}
		else {
			return stdregd;
		}
		}
	public void add(Student student) {
		studentRecords.add(student);
	}
	public String updateStudent(Student student) {
		for(int i=0; i<studentRecords.size(); i++) {
			Student stdn =  studentRecords.get(i);
			if(stdn.getRegNo().equals(student.getRegNo())) {
				studentRecords.set(i, student);
				return "updated Successfully";
			}
			
		}
		return "update un-Successfull";
	}
	public List<Student> getStudentRecords(){
		return studentRecords;
	}
	}

