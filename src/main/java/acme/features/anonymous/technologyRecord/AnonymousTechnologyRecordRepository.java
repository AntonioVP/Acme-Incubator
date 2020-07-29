
package acme.features.anonymous.technologyRecord;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.technologyRecord.TechnologyRecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousTechnologyRecordRepository extends AbstractRepository {

	@Query("select n from TechnologyRecord n where n.id = ?1")
	TechnologyRecord findTechnologyRecordById(int id);

	@Query("select n from TechnologyRecord n")
	Collection<TechnologyRecord> findAllTechnologyRecord();
}
