package com.quizApp.QuizApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.quizApp.QuizApp.dao.Dao;
import com.quizApp.QuizApp.entity.sqlquestion;



@org.springframework.stereotype.Service
public class Service {

	@Autowired
	Dao dao;
	public	List<sqlquestion>   getallquestion() {
		 return  dao.getallquestion();
	}

}
