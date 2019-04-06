package org.wecancodeit.medicinecabinetapp;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.greaterThan;

import java.util.Collection;
import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertThat;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import org.wecancodeit.medicinecabinetapp.base.classes.Medication;
import org.wecancodeit.medicinecabinetapp.base.classes.Pharmacy;
import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;
import org.wecancodeit.medicinecabinetapp.repositories.PharmacyRepository;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;


public class JPAMappingsTest {
	
	@Resource
	private MedicationRepository medicationRepo;
	
	@Resource
	private PharmacyRepository pharmacyRepo;
	
	@Resource 
	private UserRepository userRepo;
	
	@Resource
	private TestEntityManager entityManager;
	
	@Test
	public void shouldSaveAndLoadMeds() {
		Medication medication = medicationRepo.save(new Medication("Zyrtec", "dosage units", 10.5, "allergy", 1, 30));
		long medicationId = medication.getId();
		
		entityManager.flush();
		entityManager.clear();
		
		Optional<Medication>result = medicationRepo.findById(medicationId);
		result.get();
		assertThat(medication.getMedicationName(), is("medication"));
			
	}
	
	@Test
	public void shouldGenerateMedicationId() {
		Medication medication = medicationRepo.save(new Medication("medication", null, 0, null, 0, 0, null, null, null));
		long medicationId = medication.getId();
		
		entityManager.flush();
		entityManager.clear();
		
		assertThat(medicationId, is(greaterThan(0L)));
	}
	
	
	@Test
	public void shouldSaveandLoadPharmacy() {
	Pharmacy pharmacy = new Pharmacy("pharmacy name", "pharmacy phone number", "address");
	pharmacy = pharmacyRepo.save(pharmacy);
	long pharmacyId = pharmacy.getId();
	
	entityManager.flush();
	entityManager.clear();
	
	Optional<Pharmacy> result = pharmacyRepo.findById(pharmacyId);
	result.get();
	assertThat(pharmacy.getPharmacyName(), is("pharmacy name"));
	}

}
