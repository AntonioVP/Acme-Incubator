package acme.entities.francoBulletin;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FrancoBulletin extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

		private static final long	serialVersionUID	= 1L;

		// Attributes -------------------------------------------------------------
		@Column(unique = true)
		@NotBlank
		private String				title;

		private String				text;
}
