
package acme.features.anonymous.vidalBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.vidalBulletins.VidalBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousVidalBulletinListService implements AbstractListService<Anonymous, VidalBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousVidalBulletinRepository repository;


	// AbstractListService<Administrator, VidalBulletin> interface --------------------

	@Override
	public boolean authorise(final Request<VidalBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<VidalBulletin> request, final VidalBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "type", "title", "author", "text");
	}

	@Override
	public Collection<VidalBulletin> findMany(final Request<VidalBulletin> request) {
		assert request != null;

		Collection<VidalBulletin> result;

		result = this.repository.findMany();

		return result;
	}
}
