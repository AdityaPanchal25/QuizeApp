package com.quizApp.QuizApp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class sqlquestion {
	@Id
	int qn;
	String category;
	String difficultyLevel ;
	String Option1 ;
	String Option2 ;
	String Option3 ;
	String Option4;
	String questiontitle;
	String rightAnswer;
	
public int getQn() {
		return qn;
	}
	public void setQn(int qn) {
		this.qn = qn;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDifficultyLevel() {
		return difficultyLevel;
	}
	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}
	public String getOption1() {
		return Option1;
	}
	public void setOption1(String option1) {
		Option1 = option1;
	}
	public String getOption2() {
		return Option2;
	}
	public void setOption2(String option2) {
		Option2 = option2;
	}
	public String getOption3() {
		return Option3;
	}
	public void setOption3(String option3) {
		Option3 = option3;
	}
	public String getOption4() {
		return Option4;
	}
	public void setOption4(String option4) {
		Option4 = option4;
	}
	public String getQuestiontitle() {
		return questiontitle;
	}
	public void setQuestiontitle(String questiontitle) {
		this.questiontitle = questiontitle;
	}
	public String getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(String rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	@Override
	public String toString() {
		return "sqlquestion [qn=" + qn + ", category=" + category + ", difficultyLevel=" + difficultyLevel + ", Option1="
				+ Option1 + ", Option2=" + Option2 + ", Option3=" + Option3 + ", Option4=" + Option4 + ", questiontitle="
				+ questiontitle + ", rightAnswer=" + rightAnswer + "]";
	}
}
