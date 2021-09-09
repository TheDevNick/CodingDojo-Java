package com.codingdojo.StudentRoster.models;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contacts")
public class Contact {

	//contact table
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min = 2, max = 20, message = "Requires at least 2 characters")
	private String address;

	@Size(min = 2, max = 20, message = "Requires at least 2 characters")
	private String city;

	@Size(min = 2, max = 20, message = "Requires at least 2 characters")
	private String state;
	
	//1:1 relationship
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	//create/update 
	
	@Column(updatable = false)
	private Date createdAt;
	private Date updatedAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();

	}

	@PreUpdate
	protected void onUpdatecopy() {
		this.updatedAt = new Date();
	}
	
	//constructors
	public Contact() {
	}

	public Contact(String address, String city, String state, Student student) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.student = student;
	}
	
	//getters/setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
