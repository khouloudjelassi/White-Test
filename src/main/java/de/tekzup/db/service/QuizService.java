package de.tekzup.db.service;

import java.util.Set;

import org.springframework.http.ResponseEntity;
import java.util.List;


import de.tekzup.db.model.exam.Category;
import de.tekzup.db.model.exam.Quiz;

public interface QuizService {

	public Quiz addQuiz(Quiz quiz);
	public Quiz updateQuiz(Quiz quiz);
	public Set<Quiz> getQuizzes();
	public Quiz getQuiz(Long quizId);
	public void deleteQuiz(Long quizId);
	public List<Quiz> getQuizzesOfCategory(Category category);
	public List<Quiz> getActiveQuizzes();
	public List<Quiz> getActiveQuizzesOfCategory(Category c);
}
