
package acme.features.administrator.dashboard;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorDashboardRepository extends AbstractRepository {

	@Query("select count(n) from Notice n")
	Integer getTotalNotices();

	@Query("select count(t) from TechnologyRecord t")
	Integer getTotalTechnologyRecords();

	@Query("select count(t) from ToolRecord t")
	Integer getTotalToolRecords();

	//Inquiry

	@Query("select min(i.minMoney.amount) from Inquiry i")
	Double getMinMoneyActiveInquiries();

	@Query("select max(i.maxMoney.amount) from Inquiry i")
	Double getMaxMoneyActiveInquiries();

	@Query("select avg(i.minMoney.amount) from Inquiry i")
	Double getAvgMinMoneyActiveInquiries();

	@Query("select avg(i.maxMoney.amount) from Inquiry i")
	Double getAvgMaxMoneyActiveInquiries();

	@Query("select stddev(i.minMoney.amount) from Inquiry i")
	Double getStdMinMoneyActiveInquiries();

	@Query("select stddev(i.maxMoney.amount) from Inquiry i")
	Double getStdMaxMoneyActiveInquiries();

	//Overture

	@Query("select min(o.minMoney.amount) from Overture o")
	Double getMinMoneyActiveOvertures();

	@Query("select max(o.maxMoney.amount) from Overture o")
	Double getMaxMoneyActiveOvertures();

	@Query("select avg(o.minMoney.amount) from Overture o")
	Double getAvgMinMoneyActiveOvertures();

	@Query("select avg(o.maxMoney.amount) from Overture o")
	Double getAvgMaxMoneyActiveOvertures();

	@Query("select stddev(o.minMoney.amount) from Overture o")
	Double getStdMinMoneyActiveOvertures();

	@Query("select stddev(o.maxMoney.amount) from Overture o")
	Double getStdMaxMoneyActiveOvertures();

	//Para la grafica de technology

	@Query("select count(t), t.activitySector from TechnologyRecord t group by t.activitySector")
	Collection<Object[]> getTechnologiesGroupBySector();

	@Query("select 100*count(t)/(select count(te) from TechnologyRecord te), t.openSource from TechnologyRecord t")
	Collection<Object[]> getRatioOpenClosedSourceTechnologies();

	//Para la grafica de tool

	@Query("select count(t), t.activitySector from ToolRecord t group by t.activitySector")
	Collection<Object[]> getToolsGroupBySector();

	@Query("select 100*count(t)/(select count(to) from ToolRecord to), t.openSource from ToolRecord t")
	Collection<Object[]> getRatioOpenClosedSourceTools();
}
