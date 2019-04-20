package org.wecancodeit.medicinecabinetapp.mockmvctests;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import org.wecancodeit.medicinecabinetapp.base.classes.Medication;
import org.wecancodeit.medicinecabinetapp.controllers.MedicationController;

import org.wecancodeit.medicinecabinetapp.repositories.MedicationRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(MedicationController.class)
public class MedicationControllerMockMVCTest {
	
	@Resource
	private MockMvc mvc;
	
	@MockBean
	private MedicationRepository medicationRepo;
	
	
	@Mock
	private Medication medication;
	
	@Mock
	private Medication anotherMedication;
	
	@Test
	public void should_Route_To_Single_Medication_View() throws Exception {
		long arbitraryMedId =45;
		when(medicationRepo.findById(arbitraryMedId)).thenReturn(Optional.of(medication));
		mvc.perform(get("/medication?id=45")).andExpect(view().name(is("medication")));
		
	}
	
	@Test
	public void should_Be_Ok_For_Single_Medication() throws Exception {
		long arbitraryMedId =45;
		when(medicationRepo.findById(arbitraryMedId)).thenReturn(Optional.of(medication));
		mvc.perform(get("/medication?id=45")).andExpect(status().isOk());	
		
	}
	
	@Test
	public void should_Not_Be_Ok_For_Single_Medication() throws Exception {
		mvc.perform(get("/medication?id=45")).andExpect(status().isNotFound());	
		
	}
	
	
	@Test
	public void should_Put_Single_Medication_Into_Model() throws Exception {
		when(medicationRepo.findById(45L)).thenReturn(Optional.of(medication));
		mvc.perform(get("/medication?id=45")).andExpect(model().attribute("medications", is(medication)));
	}
	
	
	@Test
	public void should_Route_To_All_Medications_View() throws Exception {
		mvc.perform(get("/show-medications")).andExpect(view().name(is("medications")));
	}
	
	
	@Test
	public void should_Be_Ok_For_All_Medications() throws Exception {
		mvc.perform(get("/show-medications")).andExpect(status().isOk());
	}
	
	
	@Test
	public void should_Put_All_Medications_Into_Model() throws Exception {
		Collection<Medication> allMedications = Arrays.asList(medication, anotherMedication);
		when(medicationRepo.findAll()).thenReturn(allMedications);
		
		mvc.perform(get("/show-medications")).andExpect(model().attribute("medications", is (allMedications)));
	}
}
	


