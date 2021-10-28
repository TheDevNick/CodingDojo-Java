package com.codingdojo.Idea.models;

import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.*;


@Entity
@Table(name = "ideas")
public class Idea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Size(min = 3, message = "content must be greater than 3 characters")
	private String title;
	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Size(min = 3, message = "content must be greater than 3 characters")
	private String artist;
	@Size(min = 3, message = "content must be greater than 3 characters")
	private String album;
	private String createdBy;


	private int likes;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;


    public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	 @OneToMany(fetch=FetchType.LAZY, mappedBy="idea")
	    private List<Message> messages;
	    @ManyToOne(fetch=FetchType.LAZY)
	    @JoinColumn(name="user_id")
	    private User user;
	    @ManyToMany(fetch=FetchType.LAZY)
	    @JoinTable(
			name="likeIdeas",
			joinColumns = @JoinColumn(name="idea_id"),
			inverseJoinColumns = @JoinColumn(name="user_id")
		)
	    private List<User> users;

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Idea() {
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
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
	
	
}
