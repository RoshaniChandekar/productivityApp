package com.cg.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "app_users")
public class AppUser {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer userId;
private String userName;
private String person_Name;
private Long mobileNumber;
private String address;
private String password;
@OneToOne(cascade = CascadeType.ALL)
private Task task;
public Task getTask() {
	return task;
}

public void setTask(Task task) {
	this.task = task;
}


public String getPerson_Name() {
	return person_Name;
}

public void setPerson_Name(String person_Name) {
	this.person_Name = person_Name;
}

public Long getMobileNumber() {
	return mobileNumber;
}

public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
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



}
