package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.repository.QuestionEvaluationRepository;

@Service
public class QuestionEvaluationBusinessJPA implements QuestionEvaluationBusiness{
	
	QuestionEvaluationRepository QuestionEvaluationRepo;
	
	
	@Autowired
	public QuestionEvaluationBusinessJPA(QuestionEvaluationRepository repo){
		
		this.QuestionEvaluationRepo = repo;
	}

	@Override
	public List<QuestionEvaluation> recupererToutesLesQuestionsEvaluation() {
		
		return (List<QuestionEvaluation>)QuestionEvaluationRepo.findAll();
	}

	@Override
	public QuestionEvaluation creerQuestionEvaluation(QuestionEvaluation questionevaluation) {
		
		return QuestionEvaluationRepo.save(questionevaluation);
	}

	@Override
	public void supprimerQuestionEvaluation(QuestionEvaluation questionevaluation) {
		QuestionEvaluationRepo.delete(questionevaluation);	
	}

	@Override
	public void supprimerQuestionEvaluationParid(int idQuestionEvaluation) {
		
		QuestionEvaluationRepo.delete(idQuestionEvaluation);	
	}

	@Override
	public QuestionEvaluation rechercheQuestionEvaluationParID(int idQuestionEvaluation) {
		
		return QuestionEvaluationRepo.findOne(idQuestionEvaluation) ;
	}

	@Override
	public List<QuestionEvaluation> recupererParRubriqueEvaluation(int idRubrique) {
		return QuestionEvaluationRepo.findByRubriqueEvaluation(idRubrique);
	}

}
