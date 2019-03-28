package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.repository.QuestionRepository;


@Service
public class QuestionBusinessJPA implements QuestionBusiness{
    
	QuestionRepository QuestionRepo;
	
	
	@Autowired
	public QuestionBusinessJPA(QuestionRepository repo){
		
		this.QuestionRepo = repo;
	}
	
	@Override
	public List<Question> recupererToutesLesQuestions() {
		
		return (List<Question>) QuestionRepo.findAll();
	}

	@Override
	public Question creerQuestion(Question question) {
		
		return QuestionRepo.save(question);
	}

	@Override
	public void supprimerQuestion(Question question) {
		QuestionRepo.delete(question);
	}

	@Override
	public void supprimerQuestionParid(int idQuestion) {
		QuestionRepo.delete(idQuestion);	
	}
	
	@Override
	public Question rechercheQuestionParID(int idQuestion) {
		return QuestionRepo.findOne(idQuestion) ;
	}

}
