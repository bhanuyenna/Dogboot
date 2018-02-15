package org.java.develop.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	private String firstName;

	private String lastName;

	private String userName;

	// bi-directional many-to-one association to Userdoglike
	@OneToMany(mappedBy = "user")
	private List<Userdoglike> userdoglikes;

	public User() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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