package org.java.develop.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * The persistent class for the dog database table.
 * 
 */
@Entity
@NamedQuery(name = "Dog.findAll", query = "SELECT d FROM Dog d")
public class Dog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dogid;

	private String dogname;

	private String imageurl;

	// bi-directional many-to-one association to Breed
	@JsonIgnore
	@ManyToOne( fetch=FetchType.LAZY)
	@JoinColumn(name = "dogbreedid")
	private Breed breed;

	// bi-directional many-to-one association to Userdoglike
	@JsonIgnore
	@OneToMany(mappedBy = "dog")
	private List<Userdoglike> userdoglikes;
	
	
	@Transient
	private int count;
	
	@Transient
	private String dogBreed;

	public String getDogBreed() {
		return dogBreed;
	}

	public void setDogBreed(String dogBreed) {
		this.dogBreed = dogBreed;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Dog() {
	}

	public int getDogid() {
		return this.dogid;
	}

	public void setDogid(int dogid) {
		this.dogid = dogid;
	}

	public String getDogname() {
		return this.dogname;
	}

	public void setDogname(String dogname) {
		this.dogname = dogname;
	}

	public String getImageurl() {
		return this.imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public Breed getBreed() {
		return this.breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public List<Userdoglike> getUserdoglikes() {
		return this.userdoglikes;
	}

	public void setUserdoglikes(List<Userdoglike> userdoglikes) {
		this.userdoglikes = userdoglikes;
	}

	public Userdoglike addUserdoglike(Userdoglike userdoglike) {
		getUserdoglikes().add(userdoglike);
		userdoglike.setDog(this);

		return userdoglike;
	}

	public Userdoglike removeUserdoglike(Userdoglike userdoglike) {
		getUserdoglikes().remove(userdoglike);
		userdoglike.setDog(null);

		return userdoglike;
	}

//	@Override
//	public String toString() {
//		return "Dog [dogid=" + dogid + ", dogname=" + dogname + ", imageurl=" + imageurl + ", breed=" + breed
//				+ ", userdoglikes=" + userdoglikes + "]";
//	}

}