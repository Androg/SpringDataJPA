package se.meer.jpa.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractEntity {

	@Id
	@GeneratedValue
	private long id;

	public Long getId() {
		return id;
	}

	protected AbstractEntity() {
	}

}
