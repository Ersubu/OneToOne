package com.dakr.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "story")
public class Story {
    @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer storyId;
    @Column(name = "story_name")
    private String storyName;
    @OneToOne
    @JoinColumn(name = "book_id")
    //@JsonBackReference
    
    private Book book;
	public Integer getStoryId() {
		return storyId;
	}
	public void setStoryId(Integer storyId) {
		this.storyId = storyId;
	}
	public String getStoryName() {
		return storyName;
	}
	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "Story [storyId=" + storyId + ", storyName=" + storyName + ", book=" + book + "]";
	}
    
    

}
