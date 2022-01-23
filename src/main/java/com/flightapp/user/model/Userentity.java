package com.flightapp.user.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Userentity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2970940797005502150L;
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Integer id;
	@Column(name = "USERID",unique=true)
	private String userId;
	@Column(name = "FIRSTNAME")
	private String firstName;
	@Column(name = "LASTNAME")
	private String lastName;
	@Column(name = "EMAIL",unique=true)
	private String email;
	@Column(name = "ENCRYPTEDPASSWORD")
	private String encryptedpassword;

	@OneToMany
	private List<Ticket> tickets;
	
	@ManyToMany
	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "roleId"))
	private Collection<Role> roles;
	

}
