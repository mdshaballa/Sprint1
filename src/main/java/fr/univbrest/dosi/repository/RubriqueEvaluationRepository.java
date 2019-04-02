package fr.univbrest.dosi.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import fr.univbrest.dosi.bean.RubriqueEvaluation;

public interface RubriqueEvaluationRepository extends CrudRepository<RubriqueEvaluation, Integer> {
	
	List<RubriqueEvaluation> findByEvaluation(Long idevaluation);
	List<RubriqueEvaluation> findByRubrique(int idRubrique);
}
