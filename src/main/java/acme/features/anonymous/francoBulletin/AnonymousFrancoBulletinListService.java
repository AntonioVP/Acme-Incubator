package acme.features.anonymous.francoBulletin;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.francoBulletin.FrancoBulletin;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractListService;

@Service
public class AnonymousFrancoBulletinListService implements AbstractListService<Anonymous, FrancoBulletin> {
	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousFrancoBulletinRepository repository;


	// AbstractListService<Administrator, Shout> interface --------------------

	@Override
	public boolean authorise(final Request<FrancoBulletin> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<FrancoBulletin> request, final FrancoBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "text", "title");
	}

	@Override
	public Collection<FrancoBulletin> findMany(final Request<FrancoBulletin> request) {
		assert request != null;

		Collection<FrancoBulletin> result;
		result = this.repository.findAllFrancoBulletin();

		return result;
	}
}

