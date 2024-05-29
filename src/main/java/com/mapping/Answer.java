package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	private int Id;
	private String answer;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer(int id, String answer) {
		super();
		this.Id = id;
		this.answer = answer;
	}

	public Answer() {
		super();
	}
}
