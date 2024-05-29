package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {

	@Id
	private int Id;
	private String Question;
	
	@OneToOne
	private Answer answer;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		this.Question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Question(int id, String question, Answer answer) {
		super();
		this.Id = id;
		this.Question = question;
		this.answer = answer;
	}

	public Question() {
		super();
	}
}