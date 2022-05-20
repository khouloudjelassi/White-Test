package de.tekzup.db.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import de.tekzup.db.Repo.RoleRepository;
import de.tekzup.db.Repo.UserRepository;
import de.tekzup.db.model.User;
import de.tekzup.db.model.UserRole;
import de.tekzup.db.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public User createUser(User user, Set<UserRole> userRoles)  {
		
		User local =this.userRepository.findByUsername(user.getUsername());
		if(local!=null) {
			System.out.println("user is already there !!");
		}else {
				for(UserRole ur:userRoles) {
					roleRepository.save(ur.getRole());
				}
				user.getUserRole().addAll(userRoles);
				local= this.userRepository.save(user);
			}
		
		return local;
	}

	@Override
	public User getUser(String username) {
		return this.userRepository.findByUsername(username);
	}
	
	@Override
	public void deleteUser(Long userId) {
		 this.userRepository.deleteById(userId);
	}
}
