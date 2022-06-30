package com.cg.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Remainder 
{    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer remaiderId;
	private String mesesage;
	private String complitionDate;
	private String taskStatus;
	public Integer getRemaiderId() {
		return remaiderId;
	}
	public void setRemaiderId(Integer remaiderId) {
		this.remaiderId = remaiderId;
	}
	public String getMesesage() {
		return mesesage;
	}
	public void setMesesage(String mesesage) {
		this.mesesage = mesesage;
	}
	
	public String getComplitionDate() {
		return complitionDate;
	}
	public void setComplitionDate(String complitionDate) {
		this.complitionDate = complitionDate;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}

}
