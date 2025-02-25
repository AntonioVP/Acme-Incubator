
package acme.entities.customParameters;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CustomParameter extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotNull
	private String				spamWordsEn;

	@NotNull
	private String				spamWordsEs;

	@Range(min = 0, max = 100)
	private double				spamThreshold;

	@NotNull
	private String				sectors;
}
