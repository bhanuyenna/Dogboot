package org.java.develop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;

/**
 * The persistent class for the breed database table.
 * 
 */
@Entity
@NamedQuery(name = "Breed.findAll", query = "SELECT b FROM Breed b")
public class Breed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "breed_name")
	private String breedName;

	// bi-directional many-to-one association to Dog
	//@JsonBackReference
	@OneToMany(mappedBy = "breed", fetch=FetchType.LAZY,targetEntity=Dog.class)
	private List<Dog> dogs;

	public Breed() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreedName() {
		return this.breedName;
	}

	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}

	public List<Dog> getDogs() {
		return this.dogs;
	}

	public void setDogs(List<Dog> dogs) {
		this.dogs = dogs;
	}

	public Dog addDog(Dog dog) {
		getDogs().add(dog);
		dog.setBreed(this);

		return dog;
	}

	public Dog removeDog(Dog dog) {
		getDogs().remove(dog);
		dog.setBreed(null);

		return dog;
	}
//
//	@Override
//	public String toString() {
//		return "Breed [id=" + id + ", breedName=" + breedName + ", dogs=" + dogs+ "]";
//	}

}
