package com.cg.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Task 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer taskId;
	private String userName;
	private String password;
	private String taskName;
	private String tasklocation;
	private String timeDuration;
	private String date;
	@OneToOne(cascade = CascadeType.ALL)
	private Remainder remainder;
	public Remainder getRemainder() {
		return remainder;
	}
	public void setRemainder(Remainder remainder) {
		this.remainder = remainder;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTasklocation() {
		return tasklocation;
	}
	public void setTasklocation(String tasklocation) {
		this.tasklocation = tasklocation;
	}
	public String getTimeDuration() {
		return timeDuration;
	}
	public void setTimeDuration(String timeDuration) {
		this.timeDuration = timeDuration;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	

}
