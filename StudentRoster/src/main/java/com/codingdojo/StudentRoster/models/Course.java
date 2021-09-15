package com.codingdojo.StudentRoster.models;

import java.util.Date;
import java.util.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "courses")
public class Course {
	
		// Students Table

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@Size(min = 2, max = 20, message = "Requires at least 2 characters")
		private String name;

		// many to many Relationships
		
		@ManyToMany(fetch = FetchType.LAZY)
		@JoinTable(
				name = "courses_students",
				joinColumns = @JoinColumn(name = "course_id"),
				inverseJoinColumns = @JoinColumn(name = "student_id")
		)
		private List<Student> students;
		
		// createdAt and updatedAt

		
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
		

		// Constructors
		
		public Course() {
		}
		
		public Course(String name, List<Student> students) {
			this.name = name;
			this.students = students;
		}

		// Getters and Setters

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
		
		
		public List<Student> getStudents() {
			return students;
		}
		
		
		public void setStudents(List<Student> students) {
			this.students = students;
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

