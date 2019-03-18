package fr.univbrest.dosi.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;
@Repository
public interface ElementConstitutifRepository extends CrudRepository<ElementConstitutif, ElementConstitutifPK>{
	List <ElementConstitutif> findByUniteEnseignement(String codeUe);
}
