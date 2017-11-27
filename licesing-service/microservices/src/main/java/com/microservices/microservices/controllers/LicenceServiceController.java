package com.microservices.microservices.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.microservices.models.License;
import com.microservices.microservices.services.LicenseService;

@RestController
@RequestMapping(value = "/v1/organizations/{organizationId}/licenses")
public class LicenceServiceController {
	@Autowired
	LicenseService licenseService;

	@RequestMapping(value = "/{licenseId}", method = RequestMethod.GET)
	public License getLiceses(@PathVariable("organizationId") String organizationId,
			@PathVariable("licenseId") String licenseId) {
		return null;
	}

	@RequestMapping(value = "/{licenseId}/{clientType}", method = RequestMethod.GET)
	public License getLicensesWithClient(@PathVariable("organizationId") String organizationId,
			@PathVariable("licenseId") String licenseId, @PathVariable("clientType") String clientType) {
		return licenseService.getLicense(organizationId, licenseId, clientType);
	}
}
