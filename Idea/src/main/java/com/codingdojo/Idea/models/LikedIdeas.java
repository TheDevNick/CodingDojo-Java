package com.codingdojo.Idea.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "likedIdeas")
public class LikedIdeas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idea_id")
	private Idea idea;
	
    @OneToMany(fetch=FetchType.LAZY, mappedBy="user")
    private List<Message> messages;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(
		name="likedIdeas",
		joinColumns = @JoinColumn(name="user_id"),
		inverseJoinColumns = @JoinColumn(name="idea_id")
	)
    private List<Idea> ideas;
	
	
	
	
	 
	    

	
	

	public LikedIdeas() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Idea getIdea() {
		return idea;
	}

	public void setIdea(Idea idea) {
		this.idea = idea;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
