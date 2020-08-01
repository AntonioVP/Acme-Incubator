package acme.entities.creditCards;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.Range;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CreditCard extends DomainEntity {
		
	// Serialisation identifier -----------------------------------------------

		private static final long	serialVersionUID	= 1L;

		// Attributes -------------------------------------------------------------
		@NotBlank
		private String				holderName;

		@NotBlank
		private String				brandName;

		@NotBlank
		@CreditCardNumber
		private String				number;

		@Range(min = 1, max = 12)
		private int					exMonth;

		@Range(min = 0, max = 99)
		private int					exYear;

		@Range(min = 1, max = 999)
		private int					cvv;

		// Derived attributes -----------------------------------------------------

}
