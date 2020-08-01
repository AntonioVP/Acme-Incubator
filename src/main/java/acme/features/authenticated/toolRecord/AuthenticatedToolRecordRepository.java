
package acme.features.authenticated.toolRecord;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.toolRecord.ToolRecord;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedToolRecordRepository extends AbstractRepository {

	@Query("select n from ToolRecord n where n.id = ?1")
	ToolRecord findToolRecordById(int id);

	@Query("select n from ToolRecord n")
	Collection<ToolRecord> findAllToolRecord();
}
