package com.info.hib.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHAPTERS")
public class Chapters {

	@Id
	@Column(name = "CHAPTER_ID")
	private String chapter_id;

	@Column(name = "CHAPTER_NAME")
	private String chapter_name;

	public String getChapter_name() {
		return chapter_name;
	}

	public void setChapter_name(String chapter_name) {
		this.chapter_name = chapter_name;
	}

	public String getChapter_id() {
		return chapter_id;
	}

	public void setChapter_id(String chapter_id) {
		this.chapter_id = chapter_id;
	}

	

}
