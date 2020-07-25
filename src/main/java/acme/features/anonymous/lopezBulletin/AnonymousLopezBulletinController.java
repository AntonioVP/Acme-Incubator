
package acme.features.anonymous.lopezBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.lopezBulletin.LopezBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/lopez-bulletin/")
public class AnonymousLopezBulletinController extends AbstractController<Anonymous, LopezBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousLopezBulletinListService	listService;

	@Autowired
	private AnonymousLopezBulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}

}
