package fr.univbrest.dosi.business;

import java.util.List;


import fr.univbrest.dosi.bean.QuestionEvaluation;

public interface QuestionEvaluationBusiness {
	List<QuestionEvaluation> recupererToutesLesQuestionsEvaluation();
	QuestionEvaluation creerQuestionEvaluation(QuestionEvaluation questionevaluation);
	void supprimerQuestionEvaluation(QuestionEvaluation questionevaluation);
	void supprimerQuestionEvaluationParid(int idQuestionEvaluation);
	QuestionEvaluation rechercheQuestionEvaluationParID(int idQuestionEvaluation);
	List<QuestionEvaluation> recupererParRubriqueEvaluation(int idRubrique);
}
