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
		
		Doctor primaryCare = doctorRepo.save(new Doctor("Doogie", "888-888-8888"));
		Pharmacy walgreens = pharmacyRepo.save(new Pharmacy("Walgreens", "444 Fake Dr", "999-999-9999"));
		
		LocalTime timeToTakeMedication = LocalTime.NOON;
		
		Medication pill1 = new Medication("Ibuprofen", "mg", 1.1, "pill", "Daily", "10", timeToTakeMedication,"instructions", primaryCare, walgreens);
		medicationRepo.save(pill1);
		
		
		Medication pill2 = new Medication("Aspirin", "mg", 1.5, "pill", "Daily", "20", timeToTakeMedication, "instructions", primaryCare, walgreens);
		medicationRepo.save(pill2);
		
		Medication liquid = new Medication("Nyquil", "mL", 50, "liquid", "Daily", "1",timeToTakeMedication, "instructions", primaryCare, walgreens);
		medicationRepo.save(liquid);
		
		Medication patch = new Medication("Nicotine", "mg", 1, "patch", "Weekly", "30", timeToTakeMedication, "instructions", primaryCare, walgreens);
		medicationRepo.save(patch);
	}

}
