package fr.univbrest.dosi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.univbrest.dosi.bean.Authentification;

public interface AuthentificationRepository extends CrudRepository<Authentification,Integer>{
	
	Authentification findByLoginConnection(String loginConnection, String motPasse, String role);
	Authentification findByPseudoConnection(String pseudoConnection, String motPasse, String role);
	
}
