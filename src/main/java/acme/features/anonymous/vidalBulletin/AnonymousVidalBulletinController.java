
package acme.features.anonymous.vidalBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.vidalBulletins.VidalBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/vidal-bulletin/")
public class AnonymousVidalBulletinController extends AbstractController<Anonymous, VidalBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousVidalBulletinListService	listService;

	@Autowired
	private AnonymousVidalBulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
