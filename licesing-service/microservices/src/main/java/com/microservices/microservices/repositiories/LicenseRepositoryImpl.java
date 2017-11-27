package com.microservices.microservices.repositiories;

import java.util.List;

import com.microservices.microservices.models.License;

public class LicenseRepositoryImpl implements LicenseRepository {

	@Override
	public List<License> findByOrganizationId(String organizationId) {
		return null;
	}

	@Override
	public License findByOrganizationIdAndLicenseId(String organizationId, String licenseId) {
		return null;
	}

	@Override
	public int save(License license) {
		return 0;
	}

	@Override
	public void delete(String licenseId) {

	}

}
