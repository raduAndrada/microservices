package com.microservices.microservices.repositiories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.microservices.microservices.models.License;

@Repository
public interface LicenseRepository {
	public List<License> findByOrganizationId(String organizationId);

	public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId);

	public int save(License license);

	public void delete(String licenseId);
}
