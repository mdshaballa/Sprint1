package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;
import fr.univbrest.dosi.bean.Evaluation;
import fr.univbrest.dosi.repository.EvaluationRepository;


@Service
public class EvaluationBusinessJPA implements EvaluationBusiness{

	private EvaluationRepository evaluationRepository;
	
	
	public EvaluationBusinessJPA(EvaluationRepository evaluationRepository) {
		super();
		this.evaluationRepository = evaluationRepository;
	}
	
	@Override
	public List<Evaluation> recupererToutesLesEvaluations() {
		return (List<Evaluation>)evaluationRepository.findAll();
	}

	@Override
	public Evaluation creerEvaluation(Evaluation evaluation) {
		return evaluationRepository.save(evaluation);
	}

	@Override
	public void supprimerEvaluation(Evaluation evaluation) {
		evaluationRepository.delete(evaluation);
		
	}

	@Override
	public void supprimerEvaluationParId(Long idEvaluation) {
		evaluationRepository.delete(idEvaluation);
		
	}

}
