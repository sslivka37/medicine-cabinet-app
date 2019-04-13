package org.wecancodeit.medicinecabinetapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MedicineCabinetAppApplication extends SpringBootServletInitializer {
	
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
return application.sources(MedicineCabinetAppApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(MedicineCabinetAppApplication.class, args);
	}

}

