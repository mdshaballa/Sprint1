package fr.univbrest.dosi.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Rubrique;
import fr.univbrest.dosi.repository.RubriqueRepository;


@Service
public class RubriqueBusinessJPA implements RubriqueBusiness{
	
	private RubriqueRepository rubriqueRepository;
	
	@Autowired
	public RubriqueBusinessJPA(RubriqueRepository repo){
		
		this.rubriqueRepository = repo;
	}
	

	@Override
	public List<Rubrique> recupererTousLesRubriques() {
		return (List<Rubrique>) rubriqueRepository.findAll();
	}

	@Override
	public Rubrique rechercheRubriqueParId(Integer idRubrique) {
		return rubriqueRepository.findByidRubrique(idRubrique);
	}


	@Override
	public Rubrique AjoutRubrique(Rubrique ru) {
		return rubriqueRepository.save(ru);
	}


	@Override
	public void supprimerRubrique(Rubrique ru) {
		rubriqueRepository.delete(ru);
		
	}


	@Override
	public void supprimerRubriqueParId(Integer idRubrique) {
		rubriqueRepository.delete(idRubrique);
		
	}


	@Override
	public Rubrique modifierRubrique(Rubrique ru) {
		rubriqueRepository.save(ru);
		return null;
	}
	
	



}



	
	
	


