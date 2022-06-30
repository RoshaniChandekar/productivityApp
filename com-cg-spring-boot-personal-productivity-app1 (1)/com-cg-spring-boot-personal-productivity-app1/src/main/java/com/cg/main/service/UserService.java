package com.cg.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.cg.main.model.AppUser;
import com.cg.main.model.Task;
import com.cg.main.repository.TaskRepository;
import com.cg.main.repository.UserRepository;
@Service
public class UserService {

	@Autowired
	UserRepository ur;
	
	@Autowired
	TaskRepository tr;
	
	public AppUser saveRegistration(AppUser a) {
		
		return ur.save(a);
		
		}

	public AppUser updateUser(AppUser aa)
	{
		//this.getRegistrationDetails(aa.getUserName());
		return ur.save(aa);
	}
	
	
	
	public AppUser getRegistrationDetails(String u, String p) {
	
		return ur.findByUserNameAndPassword(u,p);
	}

	
	
	public Task saveTask(Task t) {
		
		return tr.save(t);
	}

	 
	public void deleteTask(int id)
	{
		
		ur.deleteById(id);
		
	
		
	}

}
