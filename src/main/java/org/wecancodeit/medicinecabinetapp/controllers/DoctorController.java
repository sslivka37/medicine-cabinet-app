package org.wecancodeit.medicinecabinetapp.controllers;

import java.util.Optional;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.medicinecabinetapp.base.classes.Doctor;
import org.wecancodeit.medicinecabinetapp.exceptions.DoctorNotFoundException;
import org.wecancodeit.medicinecabinetapp.repositories.DoctorRepository;

@Controller
public class DoctorController {
	
	@Resource
	private DoctorRepository doctorRepo;
	
	
	
	
	@RequestMapping("/doctor")
	public String findOneDoctor(@RequestParam(value = "id") long id, Model model) throws DoctorNotFoundException {
		Optional<Doctor> doctor = doctorRepo.findById(id);

		if (doctor.isPresent()) {
			model.addAttribute("doctors", doctor.get());
			return "doctor";

		}

		throw new DoctorNotFoundException();

	}
	
	@RequestMapping("/show-doctors")
	public String findAllDoctors(Model model) {
		model.addAttribute("doctors", doctorRepo.findAll());
		return ("doctors");
	
	}
}
