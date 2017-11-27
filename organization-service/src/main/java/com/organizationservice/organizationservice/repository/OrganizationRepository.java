package com.organizationservice.organizationservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.organizationservice.organizationservice.model.Organization;

@Repository
public interface OrganizationRepository extends CrudRepository<Organization, String> {
	public Organization findById(String organizationId);
}