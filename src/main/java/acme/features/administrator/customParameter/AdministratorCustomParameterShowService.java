
package acme.features.administrator.customParameter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.customParameters.CustomParameter;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractShowService;

@Service
public class AdministratorCustomParameterShowService implements AbstractShowService<Administrator, CustomParameter> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AdministratorCustomParameterRepository repository;


	@Override
	public boolean authorise(final Request<CustomParameter> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<CustomParameter> request, final CustomParameter entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "spamWordsEn", "spamWordsEs", "spamThreshold", "sectors");
	}

	@Override
	public CustomParameter findOne(final Request<CustomParameter> request) {
		assert request != null;

		List<CustomParameter> lista = new ArrayList<CustomParameter>(this.repository.findManyAll());

		CustomParameter result = lista.get(0);

		return result;
	}
}
