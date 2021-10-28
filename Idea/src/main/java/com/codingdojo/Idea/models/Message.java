package com.codingdojo.Idea.models;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="messages")
public class Message {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String content;
	@Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idea_id")
    private Idea idea;
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    public Message() {

	}
    public Message(User user, Idea idea, String content) {
    	this.user = user;
    	this.idea = idea;
    	this.content = content;
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public User getAuthor() {
		return user;
	}
	public void setAuthor(User user) {
		this.user = user;
	}
	public Idea getIdea() {
		return idea;
	}
	public void setIdea(Idea idea) {
		this.idea = idea;
	}
	@PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
