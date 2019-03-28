package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import fr.univbrest.dosi.bean.RubriqueEvaluation;
import fr.univbrest.dosi.business.RubriqueOnly;

public interface RubriqueEvaluationRepository extends CrudRepository<RubriqueEvaluation, Integer> {
	
	List<RubriqueOnly> findByEvaluationIdEvaluation(int idevaluation);

}
