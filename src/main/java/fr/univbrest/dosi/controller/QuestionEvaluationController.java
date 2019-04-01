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

import fr.univbrest.dosi.bean.QuestionEvaluation;
import fr.univbrest.dosi.bean.Rubrique;
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
	
	@RequestMapping(method=RequestMethod.GET, value="/RubriqueEvaluation/{idRubriqueEvaluation}")
	public List<Rubrique> recupererParRubriqueEvaluation(@PathVariable int idRubriqueEvaluation) {
		List<QuestionEvaluation> q = questionevaluationbusiness.recupererParRubriqueEvaluation(idRubriqueEvaluation);
		ArrayList<Rubrique> a = new ArrayList<Rubrique>();
		for(QuestionEvaluation e : q){
			a.add(e.getRubriqueEvaluation().getRubrique());
		} 
		return a; 
	}
	
}
