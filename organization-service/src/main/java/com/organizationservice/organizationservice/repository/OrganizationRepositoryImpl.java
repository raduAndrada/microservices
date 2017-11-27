package com.organizationservice.organizationservice.repository;

import com.organizationservice.organizationservice.model.Organization;

public class OrganizationRepositoryImpl implements OrganizationRepository {

	@Override
	public <S extends Organization> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Organization> Iterable<S> save(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Organization findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Organization> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Organization> findAll(Iterable<String> ids) {
		return null;
	}

	@Override
	public long count() {
		return 0;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Organization entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Iterable<? extends Organization> entities) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public Organization findById(String organizationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
