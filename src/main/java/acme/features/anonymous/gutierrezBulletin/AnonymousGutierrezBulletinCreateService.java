/*
 * AnonymousGutierrezBulletinCreateService.java
 *
 * Copyright (c) 2019 Rafael Corchuelo.
 *
 * In keeping with the traditional purpose of furthering education and research, it is
 * the policy of the copyright owner to permit non-commercial use and redistribution of
 * this software. It has been tested carefully, but it is not guaranteed for any particular
 * purposes. The copyright owner does not offer any warranties or representations, nor do
 * they accept any liabilities with respect to them.
 */

package acme.features.anonymous.gutierrezBulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.gutierrezBulletin.GutierrezBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousGutierrezBulletinCreateService implements AbstractCreateService<Anonymous, GutierrezBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousGutierrezBulletinRepository repository;


	@Override
	public boolean authorise(final Request<GutierrezBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void bind(final Request<GutierrezBulletin> request, final GutierrezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<GutierrezBulletin> request, final GutierrezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "advertise");

	}

	@Override
	public GutierrezBulletin instantiate(final Request<GutierrezBulletin> request) {
		assert request != null;

		GutierrezBulletin result;
		result = new GutierrezBulletin();

		return result;
	}

	@Override
	public void validate(final Request<GutierrezBulletin> request, final GutierrezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<GutierrezBulletin> request, final GutierrezBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}

}
