package com.codingdojo.StudentRoster.models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "courses_students")
public class CourseStudent {
		// CourseStudent Table handling the many-2-many for the courses and student

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		// Student Class one to many Relationships

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "course_id")
		private Course courses;						

		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "student_id")			
		private Student students;					

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

		public CourseStudent() {
		}

		public CourseStudent(Course courses, Student students) {
			this.courses = courses;
			this.students = students;
		}
		
		// Getters and Setters


		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Course getCourses() {
			return courses;
		}

		public void setCourses(Course courses) {
			this.courses = courses;
		}

		public Student getStudents() {
			return students;
		}

		public void setStudents(Student students) {
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
