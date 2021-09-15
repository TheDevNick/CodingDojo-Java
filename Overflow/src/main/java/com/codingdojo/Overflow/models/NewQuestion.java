package com.codingdojo.Overflow.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class NewQuestion {
	@NotBlank(message="Question cant be blank")
	private String question;
	@NotBlank(message="Tags cant be blank")
	private String tags;
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String[] splitTags() {
		return this.tags.split("\\s*,\\s*");
	}
}
