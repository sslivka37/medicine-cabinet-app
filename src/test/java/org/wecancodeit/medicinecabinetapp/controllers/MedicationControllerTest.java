package org.wecancodeit.medicinecabinetapp.controllers;




import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.base.classes.Doctor;
import org.wecancodeit.medicinecabinetapp.base.classes.Medication;
import org.wecancodeit.medicinecabinetapp.base.classes.Pharmacy;
import org.wecancodeit.medicinecabinetapp.exceptions.MedicationNotFoundException;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;
import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;

public class MedicationControllerTest {
	
	@InjectMocks
	private MedicationController underTest;
	
	@Mock
	private Medication medication;
	
	@Mock
	private Medication anotherMedication;
	
		
	@Mock
	private MedicationRepository medicationRepo;
	
	@Mock
	private AlertRepository alertRepo;
	
	@Mock
	private Alert alert;
	
		
	@Mock
	private Model model;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void should_Add_Single_Medication_To_Model() throws MedicationNotFoundException {
		long arbitraryMedId = 1;
		when(medicationRepo.findById(arbitraryMedId)).thenReturn(Optional.of(medication));
		
		underTest.findOneMedication(arbitraryMedId, model);
		verify(model).addAttribute("medications", medication);
		
	}

	
	@Test
	public void should_Add_All_Medications_To_Model() {
		Collection<Medication> allMedications = Arrays.asList(medication, anotherMedication);
		when(medicationRepo.findAll()).thenReturn(allMedications);
		
		
		underTest.findAllMedications(model);		
		verify(model).addAttribute("medications", allMedications);
				
	}
	
	@Test
	public void Should_Add_Additional_Medications_To_Model() {
		String alert = "alert name";
		//Alert newAlert = alertRepo.findByName(alert);
		
		String medicationName = ("foo");
		String dosageUnits = ("foo");
		double dosageAmount = (0.00);
		String medicationType = "foo";
		String frequency = "new frequency";
		int count = 0;
		
		String instructions = ("new instructions");
		Doctor doctor = new Doctor() ;
		Pharmacy pharmacy = new Pharmacy();
		Alert alertName = new Alert();
		underTest.addMedication(medicationName, dosageUnits, dosageAmount, medicationType, frequency, instructions, doctor, pharmacy, alertName);
		Medication newMedication = new Medication(instructions, instructions, dosageAmount, instructions, instructions, instructions, doctor, pharmacy, null);
		when(medicationRepo.save(newMedication)).thenReturn(newMedication);
	}


}
