package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Etudiant;


public interface EtudiantBusiness {

	public List<Etudiant> recupererTousLesEtudiant();
	public Etudiant recupererEtudiantParPK(String noEtudiant);
}
