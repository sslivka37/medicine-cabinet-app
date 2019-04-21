package org.wecancodeit.medicinecabinetapp.controllers;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.wecancodeit.medicinecabinetapp.base.classes.Pharmacy;

import org.wecancodeit.medicinecabinetapp.exceptions.PharmacyNotFoundException;

import org.wecancodeit.medicinecabinetapp.repositories.PharmacyRepository;

@Controller
public class PharmacyController {
	
	@Resource
	private PharmacyRepository pharmacyRepo;
	
	
	
	
	@RequestMapping("/pharmacy")
	public String findOnePharmacy(@RequestParam(value = "id") long id, Model model) throws PharmacyNotFoundException {
		Optional<Pharmacy> pharmacy = pharmacyRepo.findById(id);

		if (pharmacy.isPresent()) {
			model.addAttribute("pharmacies", pharmacy.get());
			return "pharmacy";

		}

		throw new PharmacyNotFoundException();

	}
	
	@RequestMapping("/show-pharmacies")
	public String findAllPharmacies(Model model) {
		model.addAttribute("pharmacies", pharmacyRepo.findAll());
		return ("pharmacies");
	
	}

}
