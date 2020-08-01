
package acme.features.anonymous.lopezBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.lopezBulletin.LopezBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousLopezBulletinRepository extends AbstractRepository {

	@Query("select l from LopezBulletin l where l.id = ?1")
	LopezBulletin findLopezBulletinById(int id);

	@Query("select l from LopezBulletin l")
	Collection<LopezBulletin> findAllLopezBulletin();
}
