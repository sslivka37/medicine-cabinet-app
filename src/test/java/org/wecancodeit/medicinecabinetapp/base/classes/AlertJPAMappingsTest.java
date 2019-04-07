package org.wecancodeit.medicinecabinetapp.base.classes;

import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.base.classes.Medication;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;
import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.containsInAnyOrder;

@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class AlertJPAMappingsTest {
	
	@Resource
	private TestEntityManager entityManager;
	
	@Resource
	private AlertRepository alertRepo;
	
	@Resource
	private UserRepository userRepo;
	
	@Resource
	private MedicationRepository medicationRepo;
	
	
	
	@Test
	public void should_Save_And_Load_Alert(){
		Alert alert = alertRepo.save(new Alert("alert", false, 1, "pill", null));
		long alertId = alert.getId();
		
		entityManager.flush();
		entityManager.clear();
		
		Optional <Alert> result = alertRepo.findById(alertId);
		alert = result.get();
		assertThat(alert.getName(), is("alert"));
		
	}
	
	@Test
	public void should_Generate_Alert_Id() {
		Alert alert = alertRepo.save(new Alert("alert", false, 1, "pill", null));
		long alertId = alert.getId();
		
		entityManager.flush();
		entityManager.clear();
		
		assertThat(alertId, is(greaterThan(0L)));
		
	}
	
	@Test
	public void should_Establish_Alert_To_Medication_Relationship() {
		Alert alert1 = alertRepo.save(new Alert("alert", false, 1, "pill", null));
		Alert alert2 = alertRepo.save(new Alert("alert", false, 1, "pill", null));
		
		Medication medication = medicationRepo.save(new Medication("med1", "mL", 1.1, "pill", 0, 0, alert1, alert2));
		long medicationId = medication.getId();
		
	
		entityManager.flush();
		entityManager.clear();
		
		Optional<Medication>result = medicationRepo.findById(medicationId);
		medication = result.get();
		
		assertThat(medication.getAlerts(), containsInAnyOrder(alert1, alert2));
		
	}

}
