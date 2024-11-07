package com.Demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	private String pName;
	@Transient
	private double salary;
	private int age;
	@OneToOne
	@Cascade(CascadeType.ALL)
	private PanCard pc;
	
}
