package fr.univbrest.dosi.business;

import java.util.List;

import org.springframework.stereotype.Service;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;
import fr.univbrest.dosi.repository.PromotionRepository;

@Service
public class PromotionBusinessJPA implements PromotionBusiness{
	
	private PromotionRepository promotionRepository;
	
	public PromotionBusinessJPA(PromotionRepository promotionRepository) {
		super();
		this.promotionRepository = promotionRepository;
	}

	@Override
	public List<Promotion> recupererTousLesPromotions() {
		return (List<Promotion>) promotionRepository.findAll();
	}

	@Override
	public Promotion recupererPromotionParPK(PromotionPK pk) {
		return promotionRepository.findOne(pk);
	}

}
