
package acme.features.anonymous.vidalBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.vidalBulletins.VidalBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousVidalBulletinRepository extends AbstractRepository {

	@Query("select s from VidalBulletin s")
	Collection<VidalBulletin> findMany();
}
