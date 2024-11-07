package com.Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
		EntityManager m=e.createEntityManager();
		EntityTransaction t=m.getTransaction();
//		PanCard pc=new PanCard();
//		pc.setAddress("bengaluru");
//		pc.setPNO("124mjdjbw2");
//		
//		Person p=new Person();
//		p.setAge(35);
//		p.setPName("Sharsth");
//		p.setSalary(12232.33);
//		p.setPc(pc);
//		
//		t.begin();
//		m.persist(p);
//		//m.persist(pc);
//		t.commit();
		
//		-------------------------------updating Parent Class-----------------------
//		Person p=m.find(Person.class, "Shivue");
//		p.setAge(50);
//		t.begin();
//		m.merge(p);
//		t.commit();
//		-------------------------------deleting Parent Class-----------------------
//		Person p=m.find(Person.class, "Shivue");
//		t.begin();
//		m.remove(p);
//		t.commit();
//		-------------------------------deleting child Class-----------------------
		Person p=m.find(Person.class, "Sharsth");
		p.setPc(null);
		t.begin();
		m.merge(p);
		t.commit();
		PanCard pc=m.find(PanCard.class,"124mjdjbw2");
		t.begin();
		m.remove(pc);
		t.commit();
		
	}

}
