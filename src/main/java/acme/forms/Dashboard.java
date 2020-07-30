
package acme.forms;

import java.io.Serializable;
import java.util.Collection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dashboard implements Serializable {

	private static final long	serialVersionUID	= 1L;

	//Atributes

	Integer						totalNotices;
	Integer						totalTechnologyRecords;
	Integer						totalToolRecords;

	Double						minMoneyActiveInquiries;
	Double						maxMoneyActiveInquiries;
	Double						avgMinMoneyActiveInquiries;
	Double						avgMaxMoneyActiveInquiries;
	Double						stdMinMoneyActiveInquiries;
	Double						stdMaxMoneyActiveInquiries;

	Double						minMoneyActiveOvertures;
	Double						maxMoneyActiveOvertures;
	Double						avgMinMoneyActiveOvertures;
	Double						avgMaxMoneyActiveOvertures;
	Double						stdMinMoneyActiveOvertures;
	Double						stdMaxMoneyActiveOvertures;

	Collection<Object[]>		technologiesGroupBySector;
	Collection<Object[]>		ratioOpenClosedSourceTechnologies;

	Collection<Object[]>		toolsGroupBySector;
	Collection<Object[]>		ratioOpenClosedSourceTools;
}
