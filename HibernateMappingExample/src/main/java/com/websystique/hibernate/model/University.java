package com.websystique.hibernate.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="UNIVERSITY")
public class University {
	
	@Id
    @GeneratedValue
	@Column(name="university_id")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="country")
	private String country;
	
	@OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
	private List<Student> student;

	public University() {
		super();
	}

	public University(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "University [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
}
