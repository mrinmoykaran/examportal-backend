package com.exam.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.helper.UserFoundException;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repository.RoleRepository;
import com.exam.repository.UserRepository;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;
	
	@Autowired
	private RoleRepository roleRepository;

	// Creating new user
	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		// TODO Auto-generated method stub
		User local = this.userrepository.findByUsername(user.getUsername());
		if (local != null) {
			System.out.println("User already exists!");
			throw new UserFoundException("User already exists!");
		} else {
			for (UserRole ur : userRoles) {
				roleRepository.save(ur.getRole());
			}
			user.getUserRoles().addAll(userRoles);
			local = this.userrepository.save(user);
		}

		return local;
	}

	@Override
	public User getUser(String username) {
		// TODO Auto-generated method stub
		return this.userrepository.findByUsername(username);
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		this.userrepository.deleteById(id);

	}

}
