package org.wecancodeit.medicinecabinetapp.controllers;


public class MedicationControllerTest {

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import org.wecancodeit.medicinecabinetapp.base.classes.Medication;

import org.wecancodeit.medicinecabinetapp.exceptions.MedicationNotFoundException;

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


}
