package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.RubriqueEvaluation;

public interface RubriqueEvaluationBusiness {

	List<RubriqueEvaluation> recupererToutesLesRubriques();
	List<RubriqueEvaluation> recupererRubriqueEvaluation(Long idevaluation);
	void creerRubriqueEvaluation(RubriqueEvaluation rubEvalACreer);
	void modifierRubriqueEvaluation(RubriqueEvaluation rubEvalAModifier);
	void supprimerRubriqueEvaluation(int idRubEval);
	List<RubriqueEvaluation> recupererRubriqueEvaluationParRubrique(int idRubrique);
}
