
package acme.features.authenticated.inquiry;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.inquiries.Inquiry;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedInquiryRepository extends AbstractRepository {

	@Query("select i from Inquiry i")
	Collection<Inquiry> findMany();

	@Query("select i from Inquiry i where i.deadline > ?1")
	Collection<Inquiry> findActive(Date ahora);

	@Query("select i from Inquiry i where i.id = ?1")
	Inquiry findOnebyId(int id);
}
