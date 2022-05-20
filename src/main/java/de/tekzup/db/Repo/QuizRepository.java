package de.tekzup.db.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.model.exam.Category;
import de.tekzup.db.model.exam.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long> {

	List<Quiz> findBycategory(Category category);
	public List<Quiz> findByActive(Boolean b);
}
