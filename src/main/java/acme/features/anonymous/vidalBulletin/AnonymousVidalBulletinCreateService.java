
package acme.features.anonymous.vidalBulletin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.vidalBulletins.VidalBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousVidalBulletinCreateService implements AbstractCreateService<Anonymous, VidalBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousVidalBulletinRepository repository;


	@Override
	public boolean authorise(final Request<VidalBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public VidalBulletin instantiate(final Request<VidalBulletin> request) {
		assert request != null;

		VidalBulletin result;

		result = new VidalBulletin();
		result.setType("ForReal");
		result.setTitle("Provisional Title");
		result.setAuthor("Estrella");
		result.setText("Write here.");

		return result;
	}

	@Override
	public void unbind(final Request<VidalBulletin> request, final VidalBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "type", "title", "author", "text");
	}

	@Override
	public void bind(final Request<VidalBulletin> request, final VidalBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void validate(final Request<VidalBulletin> request, final VidalBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<VidalBulletin> request, final VidalBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);
	}
}
