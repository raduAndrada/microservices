package com.microservices.microservices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.microservices.microservices.repositiories.LicenseRepository;
import com.microservices.microservices.repositiories.LicenseRepositoryImpl;

@Component
public class ServiceConfig {
	@Value("${example.property}")
	private String exampleProperty;

	public String getExampleProperty() {
		return exampleProperty;
	}

	@Bean
	public LicenseRepository licenseRepository() {
		return new LicenseRepositoryImpl();
	}

}