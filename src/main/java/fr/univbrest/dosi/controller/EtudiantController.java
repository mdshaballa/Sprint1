package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.business.EtudiantBusinessJPA;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
	private EtudiantBusinessJPA etudiantBusinessJPA;
	
	public EtudiantController(EtudiantBusinessJPA etu){
		super();
		this.etudiantBusinessJPA = etu;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Etudiant> recupererTousLesEtudiant(){
		return etudiantBusinessJPA.recupererTousLesEtudiant();
	}
	
}
