package com.codingdojo.mvc.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min = 5, max = 200)
    private String title;
    
    @Size(min = 5, max = 200)
    private String description;
    
    @Size(min = 3, max = 40)
    private String language;
    
    @Min(100)
    private Integer numberOfPages;
    // This will not allow the createdAt column to be updated after creation
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    public Book() {
    }
    public Book(String title, String desc, String lang, int pages) {
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = pages;
    }
    
    public Long getId() {
    	return id;
    }
    public String getTitle() {
    	return title;
    }
    
    public String getDescription() {
    	return description;
    }
    public String getLanguage() {
    	return language;
    }
    public Integer getNumberOfPages() {
    	return numberOfPages;
    }
    
    
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public void setDescription(String desc) {
    	this.description = desc;
    }
    
    public void setLanguage(String lang) {
    	this.language = lang;
    }
    
    public void setNumberOfPages(Integer numPages) {
    	this.numberOfPages = numPages;
    }
    
    
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
        
    }
    @PreUpdate
    protected void onUpdatecopy(){
        this.updatedAt = new Date();
    }
}