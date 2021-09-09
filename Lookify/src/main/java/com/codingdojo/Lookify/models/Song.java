package com.codingdojo.Lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="songs")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min = 5)
    private String title;
    
    @Size(min = 5)
    private String artist;
    
    @Range(min=0,max=10)
    private Integer rating;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    //empty constructor 
    public Song() {
    	
    }
    
    public Song(String title, String artist, Integer rating) {
    	this.title = title;
    	this.artist = artist;
    	this.rating = rating;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Integer getRating() {
		return rating;
	}
	
	public void setRating(Integer rating) {
		this.rating = rating;
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
