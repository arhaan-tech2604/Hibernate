package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class OMAnswer {

	@Id
	private int answer_id;
	private String answer;
	
	@ManyToOne
	private OMQuestion question;

	public int getAnswer_id() {
		return answer_id;
	}

	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public OMQuestion getQuestion() {
		return question;
	}

	public void setQuestion(OMQuestion question) {
		this.question = question;
	}

	public OMAnswer(int answer_id, String answer, OMQuestion question) {
		super();
		this.answer_id = answer_id;
		this.answer = answer;
		this.question = question;
	}

	public OMAnswer() {
		super();
	}
	
}