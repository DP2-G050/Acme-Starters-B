
package acme.realms;

import javax.persistence.Column;
import javax.persistence.Entity;

import acme.client.components.basis.AbstractRole;
import acme.client.components.validation.Mandatory;
import acme.constraints.ValidText;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Manager extends AbstractRole {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@Mandatory
	@ValidText
	@Column
	private String				position;

	@Mandatory
	@ValidText
	@Column
	private String				skills;

	@Mandatory
	//@Valid
	@Column
	private boolean				executive;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
