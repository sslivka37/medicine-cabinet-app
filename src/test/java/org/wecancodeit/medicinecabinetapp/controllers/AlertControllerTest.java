package org.wecancodeit.medicinecabinetapp.controllers;

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
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.exceptions.AlertNotFoundException;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;


public class AlertControllerTest {
	
	@InjectMocks
	private AlertController underTest;
	
	@Mock
	private Alert alert;
	
	@Mock
	private Alert anotherAlert;
	
		
	@Mock
	private AlertRepository alertRepo;
	
		
	@Mock
	private Model model;
	
	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void should_Add_Single_Alert_To_Model() throws AlertNotFoundException {
		long arbitraryAlertId = 1;
		when(alertRepo.findById(arbitraryAlertId)).thenReturn(Optional.of(alert));
		
		underTest.findOneAlert(arbitraryAlertId, model);
		verify(model).addAttribute("alerts", alert);
		
	}

	
	@Test
	public void should_Add_All_Alerts_To_Model() {
		Collection<Alert> allAlerts = Arrays.asList(alert, anotherAlert);
		when(alertRepo.findAll()).thenReturn(allAlerts);
		
		
		underTest.findAllAlerts(model);		
		verify(model).addAttribute("alerts", allAlerts);
				
	}

}
