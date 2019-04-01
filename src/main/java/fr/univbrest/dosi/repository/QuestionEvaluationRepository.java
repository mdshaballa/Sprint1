package fr.univbrest.dosi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.QuestionEvaluation;

public interface QuestionEvaluationRepository extends CrudRepository<QuestionEvaluation, Integer>{
    
	List<QuestionEvaluation> findByRubriqueEvaluation(int idRubriqueEvaluation);
}
