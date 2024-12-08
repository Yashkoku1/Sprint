package com.yk.entity;

import java.time.LocalDate;

import org.hibernate.annotations.processing.Pattern;

import com.fasterxml.jackson.annotation.JsonBackReference;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	

	@NonNull
	private String task;
	
	

	
	private String priority;
	
	@NotEmpty
	private String status="Pending";
	
	@Column
	private LocalDate assDate = LocalDate.now();
	@Column
	private LocalDate finDate;
@JsonBackReference
@ManyToOne
@JoinColumn(name="uid")
	private User user;

	public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getAssDate() {
		return assDate;
	}

	public void setAssDate(LocalDate assDate) {
		this.assDate = assDate;
	}

	public LocalDate getFinDate() {
		return finDate;
	}

	public void setFinDate(LocalDate finDate) {
		this.finDate = finDate;
	}
	
	
	 public Todo() {
		// TODO Auto-generated constructor stub
	}

	public Todo(int id, String task, String priority, String status, LocalDate assDate, LocalDate finDate) {
		super();
		this.id = id;
		this.task = task;
		this.priority = priority;
		this.status = status;
		this.assDate = assDate;
		this.finDate = finDate;
	}

	public Todo(String task, String priority, LocalDate finDate) {
		super();
		
		this.task = task;
		this.priority = priority;
		this.finDate = finDate;
	}
	
	 
	
	
	

}
