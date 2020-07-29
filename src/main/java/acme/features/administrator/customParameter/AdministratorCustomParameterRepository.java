
package acme.features.administrator.customParameter;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.customParameters.CustomParameter;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AdministratorCustomParameterRepository extends AbstractRepository {

	@Query("select c from CustomParameter c")
	Collection<CustomParameter> findManyAll();
}
