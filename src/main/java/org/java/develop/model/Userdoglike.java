package org.java.develop.model;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Type;

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
	private int idUserDogLike;

	// bi-directional many-to-one association to Dog
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "dogId")
	private Dog dog;

	// bi-directional many-to-one association to User
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;
	
	@Column(name="isLike")
	@Type(type="boolean")
	private Boolean isLike;

	public Boolean getIsLike() {
		return isLike;
	}

	public void setIsLike(Boolean isLike) {
		this.isLike = isLike;
	}

	public Userdoglike() {
	}

	

	public int getIdUserDogLike() {
		return idUserDogLike;
	}

	public void setIdUserDogLike(int idUserDogLike) {
		this.idUserDogLike = idUserDogLike;
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