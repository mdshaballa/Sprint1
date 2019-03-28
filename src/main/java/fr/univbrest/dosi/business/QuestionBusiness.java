package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Question;

public interface QuestionBusiness {
	List<Question> recupererToutesLesQuestions();
	Question creerQuestion(Question question);
	void supprimerQuestion(Question question);
	void supprimerQuestionParid(int idQuestion);
	Question rechercheQuestionParID(int idQuestion);
}
