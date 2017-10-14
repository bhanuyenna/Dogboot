package org.java.develop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String firstname;

	private String lastname;

	private String username;

	//bi-directional many-to-one association to Userdoglike
	@OneToMany(mappedBy="user")
	private List<Userdoglike> userdoglikes;

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Userdoglike> getUserdoglikes() {
		return this.userdoglikes;
	}

	public void setUserdoglikes(List<Userdoglike> userdoglikes) {
		this.userdoglikes = userdoglikes;
	}

	public Userdoglike addUserdoglike(Userdoglike userdoglike) {
		getUserdoglikes().add(userdoglike);
		userdoglike.setUser(this);

		return userdoglike;
	}

	public Userdoglike removeUserdoglike(Userdoglike userdoglike) {
		getUserdoglikes().remove(userdoglike);
		userdoglike.setUser(null);

		return userdoglike;
	}

}