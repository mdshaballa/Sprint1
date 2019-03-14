package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Authentification;
import fr.univbrest.dosi.business.AuthentificationBusinessJPA;

@RestController
@RequestMapping("/authentification")
public class AuthentificationController {
	
	private AuthentificationBusinessJPA authentificationBusinessJPA;

	public AuthentificationController(AuthentificationBusinessJPA authentificationBusinessJPA) {
		super();
		this.authentificationBusinessJPA = authentificationBusinessJPA;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Authentification> recupererTousLesAuthentification(){
		return authentificationBusinessJPA.recupererTousLesElementAuthentification();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/verificationAdmin")
	public Authentification VerificationRoleAdministrateur(@RequestParam String loginConnection,@RequestParam String motPasse){
		return authentificationBusinessJPA.VerificationRoleAdministrateur(loginConnection, motPasse);
	}

}
