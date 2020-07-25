/*
 * AnonymousFrancoBulletinCreateService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.anonymous.francoBulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.francoBulletin.FrancoBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousFrancoBulletinCreateService implements AbstractCreateService<Anonymous, FrancoBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousFrancoBulletinRepository repository;

	@Override
	public boolean authorise(final Request<FrancoBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<FrancoBulletin> request, final FrancoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<FrancoBulletin> request, final FrancoBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "text", "title");

	
	}

	@Override
	public FrancoBulletin instantiate(final Request<FrancoBulletin> request) {
		assert request != null;

		FrancoBulletin result;
		result = new FrancoBulletin();

		return result;
	}

	@Override
	public void validate(final Request<FrancoBulletin> request, final FrancoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<FrancoBulletin> request, final FrancoBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	
	}

}
