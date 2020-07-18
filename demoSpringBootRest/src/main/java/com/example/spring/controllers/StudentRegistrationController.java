package com.example.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.example.spring.beans.*;
@Controller
public class StudentRegistrationController {
	
	@RequestMapping(method = RequestMethod.POST, value="/register/studdent")
	
	@ResponseBody
	public StudentRegistrationReply registerStudent(Student student) {
		System.out.println("In registerStudent");
		StudentRegistrationReply stdregreply = new StudentRegistrationReply();
		StudentRegistration.getInstance().add(student);
		//we are setting the below vales to reply back the caller
		stdregreply.setAge(student.getAge());
		stdregreply.setName(student.getName());
		stdregreply.setRegNo(student.getRegNo());
		stdregreply.setRegStatus("Successful");
		
		return stdregreply;
		
		
	}

}
