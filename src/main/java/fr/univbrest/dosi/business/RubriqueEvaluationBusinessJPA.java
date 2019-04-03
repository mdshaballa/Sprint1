package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.repository.RubriqueEvaluationRepository;

@Component
public class RubriqueEvaluationBusinessJPA implements RubriqueEvaluationBusiness {
	
	private RubriqueEvaluationRepository repos ;
	
	@Autowired
	public RubriqueEvaluationBusinessJPA(RubriqueEvaluationRepository repos) {
		this.repos = repos;
	}
	
	@Override
	public List<RubriqueEvaluation> recupererToutesLesRubriques() {
		return (List<RubriqueEvaluation>) repos.findAll();
	}

	@Override
	public List<RubriqueEvaluation> recupererRubriqueEvaluation(Long idevaluation) {
		return  repos.findByEvaluation(idevaluation);
	}

	@Override
	public void creerRubriqueEvaluation(RubriqueEvaluation rubEvalACreer) {
		repos.save(rubEvalACreer);
		
	}

	@Override
	public void modifierRubriqueEvaluation(RubriqueEvaluation rubEvalAModifier) {
		repos.save(rubEvalAModifier);
		
	}

	@Override
	public void supprimerRubriqueEvaluation(int idRubEval) {
		
			repos.delete(idRubEval);
				 
	}

	@Override
	public List<RubriqueEvaluation> recupererRubriqueEvaluationParRubrique(int idRubrique) {
		return repos.findByRubrique(idRubrique);
	}

	@Override
	public RubriqueEvaluation recupererRubriqueEvalParIdRubriqueEval(int idRubriqueEval) {
		return repos.findOne(idRubriqueEval);
	}
}

