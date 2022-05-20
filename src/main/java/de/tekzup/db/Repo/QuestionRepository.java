package de.tekzup.db.Repo;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import de.tekzup.db.model.exam.Question;
import de.tekzup.db.model.exam.Quiz;

public interface QuestionRepository extends JpaRepository<Question, Long> {

	Set<Question> findByQuiz(Quiz quiz);


	
}
