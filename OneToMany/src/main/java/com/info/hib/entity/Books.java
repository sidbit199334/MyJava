package com.info.hib.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="BOOKS")
public class Books {
	
	@Id
	@Column(name="BOOK_ID")
	private String book_id;
	
	@Column(name="BOOK_NAME")
	private String book_name;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="BOOK_ID")
	private Set<Chapters> chapters;

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public Set<Chapters> getChapters() {
		return chapters;
	}

	public void setChapters(Set<Chapters> chapters) {
		this.chapters = chapters;
	}

	

	

}
