package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.univbrest.dosi.bean.Evaluation;

@Repository
public interface EvaluationRepository extends CrudRepository <Evaluation, Long>{
	
	
}
