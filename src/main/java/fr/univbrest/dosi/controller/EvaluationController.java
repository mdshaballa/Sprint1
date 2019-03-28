package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Evaluation;

import fr.univbrest.dosi.business.EvaluationBusiness;

@RestController
@RequestMapping("/evaluation")
public class EvaluationController {

	private EvaluationBusiness evaluationBusiness;
	
	@Autowired
	public EvaluationController(EvaluationBusiness business) {
		this.evaluationBusiness = business;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Evaluation> recupererToutesLesEvaluations(){
		return evaluationBusiness.recupererToutesLesEvaluations();
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Evaluation creerEvaluation(@RequestBody Evaluation evaluation) {
		return evaluationBusiness.creerEvaluation(evaluation);
	}
	
	@RequestMapping(method=RequestMethod.DELETE)
	public void supprimerEvaluation(@RequestBody Evaluation evaluation) {
		evaluationBusiness.supprimerEvaluation(evaluation);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{idEvaluation}")
	public void supprimerEvaluationParId(@RequestBody Evaluation evaluation) {
		evaluationBusiness.supprimerEvaluationParId(evaluation.getIdEvaluation());
	}
	
}
