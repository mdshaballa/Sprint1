package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Etudiant;
import fr.univbrest.dosi.repository.EtudiantRepository;

@Service
public class EtudiantBusinessJPA implements EtudiantBusiness{
      
	EtudiantRepository etudiantRepository;
	
	public EtudiantBusinessJPA(EtudiantRepository repos){
		super();
		this.etudiantRepository = repos;
	}

	@Override
	public List<Etudiant> recupererTousLesEtudiant() {
		return (List<Etudiant>) etudiantRepository.findAll();
	}

	@Override
	public Etudiant recupererEtudiantParPK(String noEtudiant) {
		return etudiantRepository.findOne(noEtudiant);
	}
	
	
}
