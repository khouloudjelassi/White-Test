package de.tekzup.db.service;

import java.util.Set;

import de.tekzup.db.model.User;
import de.tekzup.db.model.UserRole;

public interface UserService {

	//create user
	public User createUser(User user ,Set<UserRole> userRoles);

	//get user by name
	public User getUser(String username);
		
	//delete user by id
	
	public void deleteUser(Long userId);
	}

