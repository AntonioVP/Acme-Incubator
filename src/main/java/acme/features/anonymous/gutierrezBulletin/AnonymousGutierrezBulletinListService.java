
package acme.features.anonymous.gutierrezBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.gutierrezBulletin.GutierrezBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousGutierrezBulletinListService implements AbstractListService<Anonymous, GutierrezBulletin> {
	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousGutierrezBulletinRepository repository;


	@Override
	public boolean authorise(final Request<GutierrezBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<GutierrezBulletin> request, final GutierrezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "advertise");
	}

	@Override
	public Collection<GutierrezBulletin> findMany(final Request<GutierrezBulletin> request) {
		assert request != null;

		Collection<GutierrezBulletin> result;
		result = this.repository.findAllGutierrezBulletin();

		return result;
	}
}
