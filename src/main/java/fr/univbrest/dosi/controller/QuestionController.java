package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Question;
import fr.univbrest.dosi.business.QuestionBusiness;

@RestController
@CrossOrigin
@RequestMapping("/questions")
public class QuestionController {

private QuestionBusiness questionbusiness;
    
	@Autowired
	public QuestionController(QuestionBusiness questionbusiness) {
		this.questionbusiness = questionbusiness;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void creerQuestion(@RequestBody Question question) {
		questionbusiness.creerQuestion(question);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void supprimerQuestion(@RequestBody Question question) {
		questionbusiness.supprimerQuestion(question);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{idQuestion}")
	public void supprimerQuestionParid(@PathVariable int idQuestion) {
		questionbusiness.supprimerQuestionParid(idQuestion);
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Question> recupererToutesLesQuestions() {
		return questionbusiness.recupererToutesLesQuestions();
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="/{idQuestion}")
	public Question rechercheQuestionParID(@PathVariable int idQuestion) {
		return questionbusiness.rechercheQuestionParID(idQuestion);
	}
	
}

