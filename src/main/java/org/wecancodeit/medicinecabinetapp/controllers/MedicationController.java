package org.wecancodeit.medicinecabinetapp.controllers;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.wecancodeit.medicinecabinetapp.base.classes.Medication;

import org.wecancodeit.medicinecabinetapp.exceptions.MedicationNotFoundException;

import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;

@Controller
public class MedicationController {
	
	@Resource
	private MedicationRepository medicationRepo;
	
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

}


