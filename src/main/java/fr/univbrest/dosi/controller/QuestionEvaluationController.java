package fr.univbrest.dosi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.business.QuestionEvaluationBusiness;

@RestController
@CrossOrigin
@RequestMapping("/questionsevaluation")
public class QuestionEvaluationController {
	
private QuestionEvaluationBusiness questionevaluationbusiness;
    
	@Autowired
	public QuestionEvaluationController(QuestionEvaluationBusiness questionevaluationbusiness) {
		this.questionevaluationbusiness = questionevaluationbusiness;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void creerQuestionEvaluation(@RequestBody QuestionEvaluation questionevaluation) {
		questionevaluationbusiness.creerQuestionEvaluation(questionevaluation);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void supprimerQuestionEvaluation(@RequestBody QuestionEvaluation questionevaluation) {
		questionevaluationbusiness.supprimerQuestionEvaluation(questionevaluation);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{idQuestionEvaluation}")
	public void supprimerQuestionEvaluationParid(@PathVariable int idQuestionEvaluation) {
		questionevaluationbusiness.supprimerQuestionEvaluationParid(idQuestionEvaluation);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<QuestionEvaluation> recupererToutesLesQuestionsEvaluation() {
		return questionevaluationbusiness.recupererToutesLesQuestionsEvaluation();
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/{idQuestionEvaluation}")
	public QuestionEvaluation rechercheQuestionEvaluationParID(@PathVariable int idQuestionEvaluation) {
		return questionevaluationbusiness.rechercheQuestionEvaluationParID(idQuestionEvaluation);
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/RubriqueEvaluation/{idRubrique}")
	public List<Question> recupererParRubriqueEvaluation(@PathVariable int idRubrique) {
		List<QuestionEvaluation> q = questionevaluationbusiness.recupererParRubriqueEvaluation(idRubrique);
		ArrayList<Question> a = new ArrayList<Question>();
		for(QuestionEvaluation e : q){
			a.add(e.getQuestion());
		} 
		return a; 
	}
	
}
