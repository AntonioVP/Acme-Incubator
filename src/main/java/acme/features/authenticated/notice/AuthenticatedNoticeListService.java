
package acme.features.authenticated.notice;

import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.notice.Notice;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedNoticeListService implements AbstractListService<Authenticated, Notice> {
	// Internal state ---------------------------------------------------------

	@Autowired
	AuthenticatedNoticeRepository repository;


	// AbstractListService<Administrator, Shout> interface --------------------

	@Override
	public boolean authorise(final Request<Notice> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Notice> request, final Notice entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "creation", "deadline");
	}

	@Override
	public Collection<Notice> findMany(final Request<Notice> request) {
		assert request != null;

		Collection<Notice> result;
		result = this.repository.findAllNotice();

		Collection<Notice> actives = result.stream().filter(x -> x.getDeadline().after(new Date(System.currentTimeMillis()))).collect(Collectors.toList());

		return actives;
	}
}
