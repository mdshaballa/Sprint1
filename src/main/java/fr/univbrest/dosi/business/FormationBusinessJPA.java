package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repository.FormationRepository;



@Service
public class FormationBusinessJPA implements FormationBusiness {

	FormationRepository formationRepo;
	@Autowired
	public FormationBusinessJPA(FormationRepository repos) {
		this.formationRepo = repos;
	}
	
	@Override
	public List<Formation> recupererTousLesFormation() {
		return formationRepo.findAllByOrderByNomFormationAsc();
	}

	@Override
	public Formation rechercheFormationParID(String codeFormation) {
		return formationRepo.findOne(codeFormation) ;
	}
	
	public List<Formation> rechercheFormationParNom(String nomFormation) {
		return formationRepo.findByNomFormation(nomFormation);}
	@Override
	public Formation creerFormation(Formation formation) {
		return formationRepo.save(formation);
	}

	@Override
	public void supprimerFormation(Formation formation) {
		formationRepo.delete(formation);
		
	}

	@Override
	public void supprimerFormationParid(String codeFormation) {
		formationRepo.delete(codeFormation);	
	}
	

	

}
