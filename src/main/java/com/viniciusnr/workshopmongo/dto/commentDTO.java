package com.viniciusnr.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

public class commentDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String text;
	private Date date;
	private AuthorDTO author;

	public commentDTO() {
	}

	public commentDTO(String text, Date date, AuthorDTO author) {
		super();
		this.text = text;
		this.date = date;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public AuthorDTO getAuthor() {
		return author;
	}

	public void setAuthor(AuthorDTO author) {
		this.author = author;
	}
	
	


}
