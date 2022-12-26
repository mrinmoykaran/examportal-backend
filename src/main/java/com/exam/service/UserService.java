package com.exam.service;

import java.util.Set;

import com.exam.model.User;
import com.exam.model.UserRole;

public interface UserService {
	
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
	//get user by username
	public User getUser(String username);
	
	//delete the user 
	public void deleteUser(Long id);

}
