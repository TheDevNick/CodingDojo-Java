package com.codingdojo.GroupLanguages.models;


import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(min = 2, max = 20)
    private String name;
    
    @Size(min = 2, max = 20)
    private String creator;
    
    
    private String version;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    //empty constructor 
    public Language() {
    	
    }
    
    public Language(String name, String creator, String currentVersion) {
    	this.name = name;
    	this.creator = creator;
    	this.version = currentVersion;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getversion() {
		return version;
	}

	public void setversion(String version) {
		this.version = version;
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
