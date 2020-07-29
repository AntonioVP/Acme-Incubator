package acme.entities.challenges;


import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.query.criteria.internal.expression.function.CurrentDateFunction;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenge extends DomainEntity {

	private static final long	serialVersionUID	= 1L;
	
	// Attributes -------------------------------------------------------------
	@Column(unique = true)
	@NotBlank
	private String				title;

	private String				description;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date			deadline;
	
	@NotNull
	@Valid
	private Money				rewardExpert;

	@NotNull
	@Valid
	private Money				rewardAverage;

	@NotNull
	@Valid
	private Money				rewardRookie;
	
	
	//METHOD
	public Boolean isActive() {
		Calendar fecha = new GregorianCalendar();
		return this.deadline.after(fecha.getTime());

	}
}
