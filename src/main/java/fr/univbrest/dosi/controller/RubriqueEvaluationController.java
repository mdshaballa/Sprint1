package fr.univbrest.dosi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.bean.RubriqueEvaluation;

import fr.univbrest.dosi.business.RubriqueEvaluationBusiness;

@RestController
@RequestMapping("/RubriqueEvaluation")
public class RubriqueEvaluationController {
	private RubriqueEvaluationBusiness rubriqueEvaluationBusiness;
	
	@Autowired
	public RubriqueEvaluationController(RubriqueEvaluationBusiness business) {
		this.rubriqueEvaluationBusiness = business;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<RubriqueEvaluation> recupererToutesLesRubriques(){
		return rubriqueEvaluationBusiness.recupererToutesLesRubriques();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{idEvaluation}")
	public List<RubriqueEvaluation> recupererRubriqueEval(@PathVariable Long idEvaluation) {
		return  rubriqueEvaluationBusiness.recupererRubriqueEvaluation(idEvaluation);
	}
	
	/*@RequestMapping(method = RequestMethod.GET, value="/Rubrique/{idRubrique}")
	public List<Rubrique> recupererRubriqueEvalParRubrique(@PathVariable int idRubrique) {
		List<RubriqueEvaluation> L =  rubriqueEvaluationBusiness.recupererRubriqueEvaluationParRubrique(idRubrique);
		ArrayList<Rubrique> a = new ArrayList<Rubrique>();
		for(RubriqueEvaluation e : L){
			a.add(e.getRubrique());
		} 
		return a;
	}*/
	
	/*@RequestMapping(method = RequestMethod.GET, value="/Rubrique/{idRubrique}")
	public List<RubriqueEvaluation> recupererRubriqueEvalParRubrique(@PathVariable int idRubrique) {
		return  rubriqueEvaluationBusiness.recupererRubriqueEvaluationParRubrique(idRubrique);
	}*/
	
	@RequestMapping(method = RequestMethod.POST)
	public void creerRubEval(@RequestBody RubriqueEvaluation rubEvalAcreer) {
		rubriqueEvaluationBusiness.creerRubriqueEvaluation(rubEvalAcreer); 
		
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public void modifierRubEval(@RequestBody RubriqueEvaluation rubEvalAmodifier) {
		rubriqueEvaluationBusiness.modifierRubriqueEvaluation(rubEvalAmodifier); 
		
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/Supp/{idRubEval}")
	public void supprimerRubEval(@PathVariable int idRubEval) {
	   rubriqueEvaluationBusiness.supprimerRubriqueEvaluation(idRubEval);
	}
	

}
