package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.repository.AuthentificationRepository;

@Service
public class AuthentificationBusinessJPA implements AuthentificationBusiness {

	AuthentificationRepository authentificationRepository;
	
	public AuthentificationBusinessJPA(AuthentificationRepository repo){
		super();
		this.authentificationRepository = repo;
	}
	@Override
	public List<Authentification> recupererTousLesElementAuthentification() {
		return (List<Authentification>) authentificationRepository.findAll();
	}
	
	@Override
	public Authentification VerificationRoleAdministrateur(String loginConnection,String motPasse){
		return authentificationRepository.findByRole(loginConnection, motPasse);
	}
   
}
