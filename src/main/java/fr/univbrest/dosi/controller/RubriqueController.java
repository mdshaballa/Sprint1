package fr.univbrest.dosi.controller;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.business.RubriqueBusiness;



@RestController
@RequestMapping("/rubrique")

public class RubriqueController {

	
	private RubriqueBusiness rubriqueBusiness;
	
	public RubriqueController( RubriqueBusiness business){
		this.rubriqueBusiness = business;
	}
	

	@RequestMapping(method=RequestMethod.GET)
	public List<Rubrique> recupererTousLesRubriques(){
		return rubriqueBusiness.recupererTousLesRubriques();
	}
	
    
	@RequestMapping(method=RequestMethod.GET, value="/{idRubrique}")
	public Rubrique rechercheRubriqueParId(@PathVariable("idRubrique") int idRubrique){
		return rubriqueBusiness.rechercheRubriqueParId(idRubrique);
	}
	
	
	@RequestMapping(method = RequestMethod.PUT)
	public Rubrique ModificationRubrique(@RequestBody Rubrique Rubrique) {
		return rubriqueBusiness.modifierRubrique(Rubrique);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Rubrique creerRubrique(@RequestBody Rubrique Rubrique){
		return  rubriqueBusiness.AjoutRubrique(Rubrique);
	}
	

	@RequestMapping(method=RequestMethod.DELETE, value="/supprimerRubrique")
	public void supprimerRubrique(@RequestBody Rubrique  ru){
		
		rubriqueBusiness.supprimerRubrique(ru);
			
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/supprimeRubrique/{idRubrique}")
	public void supprimerRubriqueParId(@PathVariable Integer idRubrique){
		rubriqueBusiness.supprimerRubriqueParId(idRubrique);
	}
	
}




	



