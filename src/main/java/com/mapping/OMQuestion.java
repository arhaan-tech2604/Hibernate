package com.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class OMQuestion {

	@Id
	private int Question_id;
	private String Question;
	
	@OneToMany(mappedBy = "question")
	private List<OMAnswer> answer;

	public int getQuestion_id() {
		return Question_id;
	}

	public void setQuestion_id(int question_id) {
		Question_id = question_id;
	}

	public String getQuestion() {
		return Question;
	}

	public void setQuestion(String question) {
		Question = question;
	}

	public List<OMAnswer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<OMAnswer> answer) {
		this.answer = answer;
	}

	public OMQuestion(int question_id, String question, List<OMAnswer> answer) {
		super();
		Question_id = question_id;
		Question = question;
		this.answer = answer;
	}

	public OMQuestion() {
		super();
	}
	
}
