package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Evaluation;

public interface EvaluationBusiness {

	public List <Evaluation> recupererToutesLesEvaluations();

	public Evaluation creerEvaluation(Evaluation evaluation);
	
	public void supprimerEvaluation(Evaluation evaluation);
	
	public void supprimerEvaluationParId(Long idEvaluation);
}
