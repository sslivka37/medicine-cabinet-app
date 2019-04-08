package org.wecancodeit.medicinecabinetapp.base.classes;

import static org.hamcrest.CoreMatchers.is;


import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import java.time.LocalTime;
import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wecancodeit.medicinecabinetapp.repositories.DoctorRepository;
import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;
import org.wecancodeit.medicinecabinetapp.repositories.PharmacyRepository;
import org.wecancodeit.medicinecabinetapp.repositories.UserRepository;

public class MedicationsJPAMappingsTest {
	
	@RunWith(SpringJUnit4ClassRunner.class)
	@DataJpaTest
	public class AlertJPAMappingsTest {
		
		@Resource
		private TestEntityManager entityManager;
		
				
		@Resource
		private UserRepository userRepo;
		
		@Resource
		private MedicationRepository medicationRepo;
		
		@Resource
		private DoctorRepository doctorRepo;
		
		@Resource
		private PharmacyRepository pharmacyRepo;
		
		
		
		@Test
		public void should_Save_And_Load_Medication(){
			Doctor doctor = doctorRepo.save(new Doctor("name", "phone"));
			Pharmacy pharmacy = pharmacyRepo.save(new Pharmacy("name", "address", "phone"));
			
			LocalTime timeToTakeMedication = LocalTime.NOON;
			
			Medication medication = medicationRepo.save(new Medication("med1", "mL", 1.1, "pill", "daily", 0, timeToTakeMedication, "instructions",doctor, pharmacy));
			long medId = medication.getId();
			
			entityManager.flush();
			entityManager.clear();
			
			Optional <Medication> result = medicationRepo.findById(medId);
			medication = result.get();
			assertThat(medication.getMedicationName(), is("med1"));
			
		}
		
		@Test
		public void should_Generate_Medication_Id() {
			Doctor doctor = doctorRepo.save(new Doctor("name", "phone"));
			Pharmacy pharmacy = pharmacyRepo.save(new Pharmacy("name", "address", "phone"));
			
			LocalTime timeToTakeMedication = LocalTime.NOON;
			
			Medication medication = medicationRepo.save(new Medication("med1", "mL", 1.1, "pill", "daily", 0, timeToTakeMedication, "instructions",doctor, pharmacy));
			long medId = medication.getId();
			
			entityManager.flush();
			entityManager.clear();
			
			assertThat(medId, is(greaterThan(0L)));
			
		}
		
		@Test
		public void should_Establish_Medication_To_Doctor_Relationship() {
			Doctor doctor = doctorRepo.save(new Doctor("doc name", "doc phone"));
			Pharmacy pharmacy = pharmacyRepo.save(new Pharmacy("pharmacy", "address", "phone"));
			
			LocalTime timeToTakeMedication = LocalTime.NOON;
								
			Medication medication = medicationRepo.save(new Medication("med1", "mL", 1.1, "pill", "daily", 0, timeToTakeMedication, "instructions",doctor, pharmacy));			
			long medicationId = medication.getId();
			
			
			entityManager.flush();
			entityManager.clear();
			
			Optional<Medication>result = medicationRepo.findById(medicationId);
			medication = result.get();
			
			assertThat(medication.getDoctor(), is(doctor));
			
		}
		
		@Test
		public void should_Establish_Medication_To_Pharmacy_Relationship() {
			Doctor doctor = doctorRepo.save(new Doctor("doc name", "doc phone"));
			Pharmacy pharmacy = pharmacyRepo.save(new Pharmacy("pharmacy", "address", "phone"));
			
			LocalTime timeToTakeMedication = LocalTime.NOON;
								
			Medication medication = medicationRepo.save(new Medication("med1", "mL", 1.1, "pill", "daily", 0, timeToTakeMedication,"instructions",doctor, pharmacy));			
			long medicationId = medication.getId();
			
			entityManager.flush();
			entityManager.clear();
			
			Optional<Medication>result = medicationRepo.findById(medicationId);
			medication = result.get();
			
			assertThat(medication.getPharmacy(), is(pharmacy));
			
		}

	}

}
