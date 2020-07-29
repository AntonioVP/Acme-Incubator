
package acme.features.administrator.customParameter;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.customParameters.CustomParameter;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/custom-parameter/")
public class AdministratorCustomParameterController extends AbstractController<Administrator, CustomParameter> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AdministratorCustomParameterShowService showService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
