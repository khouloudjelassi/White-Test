package de.tekzup.db.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{

}
