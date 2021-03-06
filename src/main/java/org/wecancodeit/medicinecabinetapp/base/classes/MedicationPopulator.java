package org.wecancodeit.medicinecabinetapp.base.classes;

import java.time.LocalTime;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wecancodeit.medicinecabinetapp.repositories.DoctorRepository;
import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;
import org.wecancodeit.medicinecabinetapp.repositories.PharmacyRepository;

@Component
public class MedicationPopulator implements CommandLineRunner{
	
	@Resource
	private MedicationRepository medicationRepo;
	
	@Resource
	private DoctorRepository doctorRepo;
	
	@Resource
	private PharmacyRepository pharmacyRepo;

	@Override
	public void run(String... args) throws Exception {
		
		Doctor primaryCare = doctorRepo.save(new Doctor("Doogie Howser", "888-888-8888"));
		Doctor specialist1 = doctorRepo.save(new Doctor("John Dorian", "555-555-5555"));
		Doctor specialist2 = doctorRepo.save(new Doctor("Beverly Crusher", "999-999-9999"));
		
		
		Pharmacy walgreens = pharmacyRepo.save(new Pharmacy("Walgreens", "444 Fake Dr, Cleveland OH 44102", "999-999-9999"));
		Pharmacy cvs = pharmacyRepo.save(new Pharmacy("CVS", "222 Pleasant Dr, Denver CO 99999", "216-867-5309"));
		
		LocalTime timeToTakeMedication1 = LocalTime.NOON;
		LocalTime timeToTakeMedication2 = LocalTime.of(3, 30);
		LocalTime timeToTakeMedication3 = LocalTime.of(20, 30);
		LocalTime timeToTakeMedication4 = LocalTime.of(7, 00);
		
		
		Medication pill1 = new Medication("Ibuprofen", "mg", 200, "Pill", "Daily", "200", timeToTakeMedication1,"Take 2 pills every 4-6 hours", primaryCare, walgreens);
		medicationRepo.save(pill1);
		
		
		Medication pill2 = new Medication("Aspirin", "mg", 350, "Pill", "Daily", "250", timeToTakeMedication2, "Take 1 pill every 4 hours", specialist1, cvs);
		medicationRepo.save(pill2);
		
		Medication liquid = new Medication("Nyquil", "mL", 30, "Liquid", "Daily", "1 bottle",timeToTakeMedication3, "take before bed, can take every six hours", specialist2, cvs);
		medicationRepo.save(liquid);
		
		Medication patch = new Medication("Nicotine", "mg", 21, "Patch", "Weekly", "30", timeToTakeMedication4, "Apply the patch to a clean, dry, hairless area of skin", primaryCare, walgreens);
		medicationRepo.save(patch);
	}

}
