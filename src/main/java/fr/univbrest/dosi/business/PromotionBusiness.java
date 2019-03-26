package fr.univbrest.dosi.business;

import java.util.List;

import fr.univbrest.dosi.bean.Promotion;
import fr.univbrest.dosi.bean.PromotionPK;


public interface PromotionBusiness {
	List<Promotion> recupererTousLesPromotions();
	Promotion recupererPromotionParPK(PromotionPK pk);
}
