package de.tekzup.db.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public User findByUsername (String username);
}
