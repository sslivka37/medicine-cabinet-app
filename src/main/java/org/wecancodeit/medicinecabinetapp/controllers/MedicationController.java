package org.wecancodeit.medicinecabinetapp.controllers;




import java.time.LocalTime;
import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.base.classes.Doctor;
import org.wecancodeit.medicinecabinetapp.base.classes.Medication;
import org.wecancodeit.medicinecabinetapp.base.classes.Pharmacy;
import org.wecancodeit.medicinecabinetapp.exceptions.MedicationNotFoundException;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;
import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;

@Controller
public class MedicationController {
	
	@Resource
	private MedicationRepository medicationRepo;
	
	@Resource
	private AlertRepository alertRepo;
	
	@RequestMapping("/medication")
	public String findOneMedication(@RequestParam(value="id")long id, Model model) throws MedicationNotFoundException {
		Optional<Medication> medication = medicationRepo.findById(id);
	
		if(medication.isPresent()) {
			model.addAttribute("medications", medication.get());
			return "medication";
			
		}
		
		throw new MedicationNotFoundException();
		
		}

	@RequestMapping("/show-medications")
	public String findAllMedications(Model model) {
		model.addAttribute("medications", medicationRepo.findAll());
		return("medications");
		
	}
	
	@RequestMapping("/show-todays-medications")
	public String findTodaysMedications(Model model) {
		model.addAttribute("medications", medicationRepo.findAll());
		return("medicationsForToday");
		
	}

	
	//public String addMedication(String medicationName, String dosageUnits, double dosageAmount, String medicationType,
			//String frequency, int count, LocalTime timeToTakeMedication, String instructions, Doctor doctor, Pharmacy pharmacy,
			//Long alertName) {
		//Optional<Alert> alert = alertRepo.findById(alertName);
		//Medication newMedication = medicationRepo.findByName(medicationName);
		
		//if(newMedication==null) {
			//newMedication = new Medication(medicationName, dosageUnits, dosageAmount, medicationType,
					//frequency, timeToTakeMedication, instructions, doctor, pharmacy, alertName);
			//medicationRepo.save(newMedication);
		//}
		//return "redirect:/show-medications";
		
	
	@RequestMapping("/add-medication")
	public Medication addMedication(String medicationName, String dosageUnits, double dosageAmount, String medicationType,
			String frequency, String instructions, Doctor doctor, Pharmacy pharmacy,
			Alert alertName) {
		// TODO Auto-generated method stub
		Alert alert = alertRepo.findByName(alertName);
		Medication newMedication = medicationRepo.findByName(medicationName);
		
		
		if(newMedication==null) {
			newMedication = new Medication(medicationName, dosageUnits, dosageAmount, medicationType,
					frequency, instructions, doctor, pharmacy, alertName);
			medicationRepo.save(newMedication);
		}
		return newMedication;
	}

}



