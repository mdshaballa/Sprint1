package fr.univbrest.dosi.business;
import java.util.List;


import fr.univbrest.dosi.bean.Rubrique;

public interface RubriqueBusiness {
 
	List<Rubrique> recupererTousLesRubriques();
	Rubrique rechercheRubriqueParId(Integer idRubrique);
	Rubrique modifierRubrique(Rubrique ru);
	Rubrique AjoutRubrique(Rubrique ru);
	void supprimerRubrique(Rubrique ru);
	void supprimerRubriqueParId(Integer idRubrique);
	
	
}










	
