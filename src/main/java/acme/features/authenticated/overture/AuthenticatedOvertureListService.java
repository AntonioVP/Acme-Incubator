
package acme.features.authenticated.overture;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.overture.Overture;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedOvertureListService implements AbstractListService<Authenticated, Overture> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AuthenticatedOvertureRepository repository;


	// AbstractListService --------------------

	@Override
	public boolean authorise(final Request<Overture> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Overture> request, final Overture entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "creation", "deadline");
	}

	@Override
	public Collection<Overture> findMany(final Request<Overture> request) {
		assert request != null;

		Collection<Overture> result;
		result = this.repository.findAllOverture();

		Collection<Overture> actives = result.stream().filter(x -> x.getDeadline().after(new Date(System.currentTimeMillis()))).collect(Collectors.toList());

		return actives;
	}
}
