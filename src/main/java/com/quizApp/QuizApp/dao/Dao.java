package com.quizApp.QuizApp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.quizApp.QuizApp.entity.sqlquestion;

@Repository

public class Dao {
	SessionFactory sf;
	
	public List<sqlquestion> getallquestion() {
Session session=sf.openSession();		
Criteria criteria=session.createCriteria(sqlquestion.class);
		List<sqlquestion>list=criteria.list();
		return list;
	}
		
//	Criteria criteria = session.createCriteria(sqlquestion.class);
//	List<sqlquestion> list = criteria.list();
//	session.close();
//	return list;
//	}
}
