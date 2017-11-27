package com.organizationservice.organizationservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.organizationservice.organizationservice.repository.OrganizationRepository;
import com.organizationservice.organizationservice.repository.OrganizationRepositoryImpl;

@Component
public class ServiceConfig {

	@LoadBalanced
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public OrganizationRepository organizationRepository() {
		return new OrganizationRepositoryImpl();
	}
}