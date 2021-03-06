package fr.univbrest.dosi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.business.PromotionBusinessJPA;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

	private PromotionBusinessJPA promotionBusinessJPA;

	public PromotionController(PromotionBusinessJPA promotionBusinessJPA) {
		super();
		this.promotionBusinessJPA = promotionBusinessJPA;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Promotion> recupererTousLesPromotions(){
		return promotionBusinessJPA.recupererTousLesPromotions();
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/{anneeUniversitaire}/{codeFormation}")
	public Promotion recupererPromotionParPK(@PathVariable String anneeUniversitaire, @PathVariable String codeFormation){
		PromotionPK pk = new PromotionPK(anneeUniversitaire,codeFormation);
		return promotionBusinessJPA.recupererPromotionParPK(pk);
	}
}
