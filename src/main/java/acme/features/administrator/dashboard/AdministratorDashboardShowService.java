
package acme.features.administrator.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.forms.Dashboard;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Administrator;
import acme.framework.services.AbstractShowService;

@Service
public class AdministratorDashboardShowService implements AbstractShowService<Administrator, Dashboard> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AdministratorDashboardRepository repository;


	@Override
	public boolean authorise(final Request<Dashboard> request) {
		assert request != null;

		return true;
	}

	@Override
	public void unbind(final Request<Dashboard> request, final Dashboard entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "totalNotices", "totalTechnologyRecords", "totalToolRecords", "minMoneyActiveInquiries", "maxMoneyActiveInquiries", "avgMinMoneyActiveInquiries", "avgMaxMoneyActiveInquiries", "stdMinMoneyActiveInquiries",
			"stdMaxMoneyActiveInquiries", "minMoneyActiveOvertures", "maxMoneyActiveOvertures", "avgMinMoneyActiveOvertures", "avgMaxMoneyActiveOvertures", "stdMinMoneyActiveOvertures", "stdMaxMoneyActiveOvertures", "technologiesGroupBySector",
			"ratioOpenClosedSourceTechnologies", "toolsGroupBySector", "ratioOpenClosedSourceTools");
	}

	@Override
	public Dashboard findOne(final Request<Dashboard> request) {
		assert request != null;

		Dashboard result = new Dashboard();

		result.setTotalNotices(this.repository.getTotalNotices());
		result.setTotalTechnologyRecords(this.repository.getTotalTechnologyRecords());
		result.setTotalToolRecords(this.repository.getTotalToolRecords());

		//Cosas Inquiry

		result.setMinMoneyActiveInquiries(this.repository.getMinMoneyActiveInquiries());
		result.setMaxMoneyActiveInquiries(this.repository.getMaxMoneyActiveInquiries());
		result.setAvgMinMoneyActiveInquiries(this.repository.getAvgMinMoneyActiveInquiries());
		result.setAvgMaxMoneyActiveInquiries(this.repository.getAvgMaxMoneyActiveInquiries());
		result.setStdMinMoneyActiveInquiries(this.repository.getStdMinMoneyActiveInquiries());
		result.setStdMaxMoneyActiveInquiries(this.repository.getStdMaxMoneyActiveInquiries());

		//Cosas Overtures

		result.setMinMoneyActiveOvertures(this.repository.getMinMoneyActiveOvertures());
		result.setMaxMoneyActiveOvertures(this.repository.getMaxMoneyActiveOvertures());
		result.setAvgMinMoneyActiveOvertures(this.repository.getAvgMinMoneyActiveOvertures());
		result.setAvgMaxMoneyActiveOvertures(this.repository.getAvgMaxMoneyActiveOvertures());
		result.setStdMinMoneyActiveOvertures(this.repository.getStdMinMoneyActiveOvertures());
		result.setStdMaxMoneyActiveOvertures(this.repository.getStdMaxMoneyActiveOvertures());

		//Datos de graficas technology

		result.setTechnologiesGroupBySector(this.repository.getTechnologiesGroupBySector());
		result.setRatioOpenClosedSourceTechnologies(this.repository.getRatioOpenClosedSourceTechnologies());

		//Datos de graficas technology

		result.setToolsGroupBySector(this.repository.getToolsGroupBySector());
		result.setRatioOpenClosedSourceTools(this.repository.getRatioOpenClosedSourceTools());

		return result;
	}
}
