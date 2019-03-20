package fr.univbrest.dosi.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.collect.Lists;

import fr.univbrest.dosi.bean.ElementConstitutif;
import fr.univbrest.dosi.bean.ElementConstitutifPK;

@RunWith(SpringJUnit4ClassRunner.class)
public class ElementConstitutifRepositoryTest {

	BigDecimal a = new BigDecimal(155);

	private ElementConstitutifRepository ElementConstitutifRepos;

	@Before
	public void setup() {
		List<ElementConstitutif> listeElementConstitutif = Lists.newArrayList();
		ElementConstitutifRepos = new ElementConstitutifRepositoryList(listeElementConstitutif);

		ElementConstitutif ElementConstitutif = new ElementConstitutif(
				new ElementConstitutifPK("M2DOSI", "codeUe", "CodeUc"), "description", "Toto", a, a, a);
		ElementConstitutif ElementConstitutif2 = new ElementConstitutif(
				new ElementConstitutifPK("M2DOSI", "codeUe2", "CodeUc2"), "description", "Toto2", a, a, a);
		ElementConstitutifRepos.save(ElementConstitutif);
		ElementConstitutifRepos.save(ElementConstitutif2);
	}

	@Test
	public void LesElementsConstitutifs() {
		assertThat(ElementConstitutifRepos.count()).isEqualTo(2);
	}

	@Test
	public void RechercheParID() {
		ElementConstitutif elementConstitutif = ElementConstitutifRepos
				.findOne(new ElementConstitutifPK("M2DOSI", "codeUe", "CodeUc"));
		assertThat(elementConstitutif.getDesignation()).matches("Toto");
	}

}

class ElementConstitutifRepositoryList implements ElementConstitutifRepository {

	List<ElementConstitutif> elementsconstitutifs;

	public ElementConstitutifRepositoryList(List<ElementConstitutif> elementsconstitutifs) {
		this.elementsconstitutifs = elementsconstitutifs;
	}

	@Override
	public long count() {
		return elementsconstitutifs.size();
	}

	@Override
	public void delete(ElementConstitutifPK arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(ElementConstitutif entity) {
		if (elementsconstitutifs.remove(entity)) {
			System.out.println("Done/Suppression");
		} else {
			System.out.println("Not Done/Suppression");
		}
	}

	@Override
	public void delete(Iterable<? extends ElementConstitutif> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exists(ElementConstitutifPK arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<ElementConstitutif> findAll() {
		return elementsconstitutifs;
	}

	@Override
	public Iterable<ElementConstitutif> findAll(Iterable<ElementConstitutifPK> arg0) {

		return null;
	}

	@Override
	public ElementConstitutif findOne(ElementConstitutifPK arg0) {
		List<ElementConstitutif> datas = elementsconstitutifs.stream().filter(element -> element.getId().equals(arg0))
				.collect(Collectors.toList());
		return datas.size() != 0 ? datas.get(0) : null;
	}

	@Override
	public <S extends ElementConstitutif> S save(S entity) {
		elementsconstitutifs.add(entity);
		return entity;
	}

	@Override
	public <S extends ElementConstitutif> Iterable<S> save(Iterable<S> arg0) {

		return null;
	}

	@Override
	public List<ElementConstitutif> findByUniteEnseignement(String codeUe) {

		return null;
	}

}