
package acme.entities.vidalBulletins;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class VidalBulletin extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@Pattern(regexp = "BigNews|Joke|ForReal")
	private String				type;

	@NotBlank
	private String				title;

	@NotBlank
	private String				author;

	@NotBlank
	private String				text;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
