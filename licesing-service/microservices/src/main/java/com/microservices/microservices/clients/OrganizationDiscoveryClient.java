package com.microservices.microservices.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.organizationservice.organizationservice.model.Organization;

@Component
public class OrganizationDiscoveryClient {

	@Autowired
	private DiscoveryClient discoveryClient;

	public Organization getOrganization(String organizationId) {
		final RestTemplate restTemplate = new RestTemplate();
		final List<ServiceInstance> instances = discoveryClient.getInstances("organizationservice");

		if (instances.size() == 0) {
			return null;
		}
		final String serviceUri = String.format("%s/v1/organizations/%s", instances.get(0).getUri().toString(),
				organizationId);
		System.out.println("!!!! SERVICE URI:  " + serviceUri);

		final ResponseEntity<Organization> restExchange = restTemplate.exchange(serviceUri, HttpMethod.GET, null,
				Organization.class, organizationId);

		return restExchange.getBody();
	}
}