
package fr.univbrest.dosi.repository;
import org.springframework.data.repository.CrudRepository;


import fr.univbrest.dosi.bean.Rubrique;


public interface RubriqueRepository extends CrudRepository<Rubrique, Integer>{
	
	Rubrique findByidRubrique(Integer idRubrique);
	
}



