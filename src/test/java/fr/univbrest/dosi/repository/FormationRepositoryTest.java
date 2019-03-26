package fr.univbrest.dosi.repository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Lists;


import fr.univbrest.dosi.bean.Formation;
import fr.univbrest.dosi.repository.FormationRepository;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
public class FormationRepositoryTest {
	

	FormationRepository formationRepo;
	
	
	@Before
	public void setup() {
		List<Formation> listeFormation = Lists.newArrayList();
		formationRepo = new FormationRepositoryList(listeFormation);
		
		Formation formation1 = new Formation("DOSI2", new Date(), "M", "O", new Date(), BigDecimal.valueOf(2.0), "DOSI2");
		Formation formation2 = new Formation("DOSI3", new Date(), "M", "N", new Date(), BigDecimal.valueOf(3.0), "DOSI3");
	
		formationRepo.save(formation1);
		formationRepo.save(formation2);
	}
	
	@Test
	public void doitCompterLesFomations() {
		long resultat = formationRepo.count();
		
		assertThat(resultat).isEqualTo(2);
	}
	

}

class FormationRepositoryList implements FormationRepository{
	private List<Formation> formations;
	
	public FormationRepositoryList(List<Formation> formations) {
		this.formations = formations;
	}

	@Override
	public long count() {
		return formations.size();
	}

	@Override
	public void delete(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Formation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Formation> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Formation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Formation> findAll(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Formation findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Formation> S save(S entity) {
		formations.add(entity);
		return entity;
	}

	@Override
	public <S extends Formation> Iterable<S> save(Iterable<S> arg0) {
		return null;
	}

	@Override
	public List<Formation> findByNomFormation(String nomFormation) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public List<Formation> findAllByOrderByNomFormationAsc() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
