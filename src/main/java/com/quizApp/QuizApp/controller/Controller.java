package com.quizApp.QuizApp.controller;

import com.quizApp.QuizApp.entity.sqlquestion;
import com.quizApp.QuizApp.service.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	Service service;
	
	@GetMapping("/get")
	public void getallquestion() {
		 List<sqlquestion>list= service.getallquestion();
	System.out.println(list);
	}

}
