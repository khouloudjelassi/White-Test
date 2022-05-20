package de.tekzup.db.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.model.exam.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
