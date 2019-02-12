package org.mql.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("REVIEWER")
public class Reviewer extends User {
	@ManyToOne
	private Domain domain;
	

	public Reviewer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reviewer(Long id, String userName, String password, Role role) {
		super(id, userName, password, role);
		// TODO Auto-generated constructor stub
	}

	public Reviewer(Long id, String userName, String password, Role role, Domain domain) {
		super(id, userName, password, role);
		this.domain = domain;
	}

	public Domain getDomain() {
		return domain;
	}

	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "Reviewer [domain=" + domain + ", Id" + getId() + ", UserName" + getUserName()
				+ ", Password" + getPassword() + ", Role" + getRole() + "]";
	}


}
