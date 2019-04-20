package org.wecancodeit.medicinecabinetapp.base.classes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.medicinecabinetapp.repositories.PharmacyRepository;
import org.wecancodeit.medicinecabinetapp.base.classes.Pharmacy;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class PharmacyJPAMappingsTest {
	
	@Resource
	private PharmacyRepository pharmacyRepo;
	
	@Resource
	private TestEntityManager entityManager;
	
	@Test
	public void shouldSaveandLoadPharmacy() {
		
			Pharmacy pharmacy = pharmacyRepo.save(new Pharmacy("pharmacy", "address", "phone"));
			long pharmacyId = pharmacy.getId();
			
			entityManager.flush();
			entityManager.clear();
			
			Optional <Pharmacy> result = pharmacyRepo.findById(pharmacyId);
			pharmacy = result.get();
			assertThat(pharmacy.getPharmacyName(), is("pharmacy"));

	}
}
