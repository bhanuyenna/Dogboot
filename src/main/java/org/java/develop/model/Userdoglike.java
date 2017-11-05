package org.java.develop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the userdoglike database table.
 * 
 */
@Entity
@NamedQuery(name = "UserDogLike.findAll", query = "SELECT u FROM Userdoglike u")
public class Userdoglike implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iduserdoglike;

	// bi-directional many-to-one association to Dog
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "userdogdogid")
	private Dog dog;

	// bi-directional many-to-one association to User
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "userdogid")
	private User user;

	public Userdoglike() {
	}

	public int getIduserdoglike() {
		return this.iduserdoglike;
	}

	public void setIduserdoglike(int iduserdoglike) {
		this.iduserdoglike = iduserdoglike;
	}

	public Dog getDog() {
		return this.dog;
	}

	public void setDog(Dog dog) {
		this.dog = dog;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}