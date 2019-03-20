package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.util.Lists;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import fr.univbrest.dosi.bean.UniteEnseignement;
import fr.univbrest.dosi.bean.UniteEnseignementPK;

@RunWith(SpringJUnit4ClassRunner.class)
public class UniteEnseignementRepositoryTest {
	
	UniteEnseignementRepository uniteEnseignementRepository;
	
	@Before
	public void setup() {
		
		List<UniteEnseignement> listUniteEnseignement = Lists.newArrayList();
		uniteEnseignementRepository = new UniteEnseignementRepositoryList(listUniteEnseignement);
		UniteEnseignementPK UNpk = new UniteEnseignementPK("M2DOSI","ISI");
		UniteEnseignement UN = new UniteEnseignement(UNpk);
		uniteEnseignementRepository.save(UN);
	}
	
	@Test
	public void RechercheParID() {
   UniteEnseignementPK UEPK = new UniteEnseignementPK("M2DOSI","ISI");
	UniteEnseignement UE = new UniteEnseignement(UEPK,"9");
	uniteEnseignementRepository.save(UE);
	List<UniteEnseignement> resultat = uniteEnseignementRepository.findBySemestre("9");
	
	assertThat(resultat.get(0).getSemestre()).isEqualTo("9");
	}
	
	@Test
	public void doitCompterLesUniteEnseignement() {
		assertThat(uniteEnseignementRepository.count()).isEqualTo(1);
	}
}

class UniteEnseignementRepositoryList implements fr.univbrest.dosi.repository.UniteEnseignementRepository {

	private List<UniteEnseignement> data;
	
	public UniteEnseignementRepositoryList(List<UniteEnseignement> uniteEnseignement) {
		this.data = uniteEnseignement;
	}
	
	public UniteEnseignementRepositoryList() {
		data = Lists.newArrayList();
	}
	
	@Override
	public long count() {
		return data.size();
	}

	@Override
	public void delete(UniteEnseignementPK arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UniteEnseignement UE) {
		data.remove(UE);
		
	}

	@Override
	public void delete(Iterable<? extends UniteEnseignement> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(UniteEnseignementPK arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UniteEnseignement> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UniteEnseignement> findAll(Iterable<UniteEnseignementPK> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UniteEnseignement findOne(UniteEnseignementPK arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends UniteEnseignement> S save(S entity) {
		data.add(entity);
		return entity;
	}

	@Override
	public <S extends UniteEnseignement> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UniteEnseignement> findBySemestre(String semestre) {
		List<UniteEnseignement> liste=Lists.newArrayList();
		for(UniteEnseignement c : data) {
			if(c.getSemestre() == semestre) {
				liste.add(c);
			}
		}
		return liste;
	}

	@Override
	public List<UniteEnseignement> findByEnseignant(long noEnseignant) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<UniteEnseignement> findByFormation(String codeFormation) {
		List<UniteEnseignement> liste=Lists.newArrayList();
		for(UniteEnseignement c : data) {
			if(c.getFormation().getCodeFormation() == codeFormation) {
				liste.add(c);
			}
		}
		return liste;
	}

	
}


