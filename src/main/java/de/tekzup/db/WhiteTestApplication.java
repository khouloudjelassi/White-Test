package de.tekzup.db;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.tekzup.db.model.Role;
import de.tekzup.db.model.User;
import de.tekzup.db.model.UserRole;
import de.tekzup.db.service.UserService;

@SpringBootApplication
public class WhiteTestApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(WhiteTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
System.out.println("starting code");	

	User user =new User();
	
	user.setFirstName("rihab");
	user.setLastName("abassi");
	user.setUsername("rihab2017");
	user.setPassword("2017");
	user.setEmail("khouloudjelassi98@gmail.com");
	user.setPhone("90017926");
	user.setProfile("default.png");
	
	Role role1=new Role();
	role1.setRoleId(44L);
	role1.setRoleName("ADMIN");
	
	Set<UserRole> userRoleSet=new HashSet<>();
	UserRole userRole=new UserRole();
	userRole.setRole(role1);
	userRole.setUser(user);
	
	userRoleSet.add(userRole);
	
	User user1=this.userService.createUser(user, userRoleSet);
	System.out.println(user1.getUsername());
	}
	


}




