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
import org.wecancodeit.medicinecabinetapp.base.classes.Alert;
import org.wecancodeit.medicinecabinetapp.controllers.AlertController;
import org.wecancodeit.medicinecabinetapp.repositories.AlertRepository;




@RunWith(SpringRunner.class)
@WebMvcTest(AlertController.class)
public class AlertControllerMockMVCTest {

	
	@Resource
	private MockMvc mvc;
	
	@MockBean
	private AlertRepository alertRepo;
	
	
	@Mock
	private Alert alert;
	
	@Mock
	private Alert anotherAlert;
	
	
	
	@Test
	public void should_Route_To_Single_Alert_View() throws Exception {
		long arbitraryAlertId =1;
		when(alertRepo.findById(arbitraryAlertId)).thenReturn(Optional.of(alert));
		mvc.perform(get("/alert?id=1")).andExpect(view().name(is("alert")));
		
	}
	
	@Test
	public void should_Be_Ok_For_Single_Alert() throws Exception {
		long arbitraryAlertId =1;
		when(alertRepo.findById(arbitraryAlertId)).thenReturn(Optional.of(alert));
		mvc.perform(get("/alert?id=1")).andExpect(status().isOk());	
		
	}
	
	@Test
	public void should_Not_Be_Ok_For_Single_Alert() throws Exception {
		mvc.perform(get("/alert?id=1")).andExpect(status().isNotFound());	
		
	}
	
	
	@Test
	public void should_Put_Single_Alert_Into_Model() throws Exception {
		when(alertRepo.findById(1L)).thenReturn(Optional.of(alert));
		mvc.perform(get("/alert?id=1")).andExpect(model().attribute("alerts", is(alert)));
	}
	
	
	@Test
	public void should_Route_To_All_Alerts_View() throws Exception {
		mvc.perform(get("/show-alerts")).andExpect(view().name(is("alerts")));
	}
	
	
	@Test
	public void should_Be_Ok_For_All_Alerts() throws Exception {
		mvc.perform(get("/show-alerts")).andExpect(status().isOk());
	}
	
	
	@Test
	public void should_Put_All_Alerts_Into_Model() throws Exception {
		Collection<Alert> allAlerts = Arrays.asList(alert, anotherAlert);
		when(alertRepo.findAll()).thenReturn(allAlerts);
		
		mvc.perform(get("/show-alerts")).andExpect(model().attribute("alerts", is (allAlerts)));
	}
}
