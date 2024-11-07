package OnetoMany;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		EntityManager em=emf.createEntityManager();
		EntityTransaction t=em.getTransaction();
		
//		Student s1=new Student();
//		s1.setSName("mala");
//		s1.setAge(22);
//		Student s2=new Student();
//		s2.setSName("manjula");
//		s2.setAge(23);
//		Student s3=new Student();
//		s3.setSName("shrilela");
//		s3.setAge(25);
//		
//		Trainer t1=new Trainer();
//		t1.setTName("Kiran sir");
//		t1.setSubject("SQL");
//		t1.setSt(Arrays.asList(s1,s2,s3));
//		
//		t.begin();
//		em.persist(t1);
//		t.commit();
		
//		--------------------fetching Student class-------------------------
//		Student s3=em.find(Student.class,"Shivu");
//		System.out.println(s3);
//		-------------------fetching Parent class---------------------------
//		Trainer t3=em.find(Trainer.class, "Shankar sir");
//		System.out.println(t3);
//		-------------------Updating the parent Class-----------------------
//		Trainer t2=em.find(Trainer.class,"Shankar sir");
//		t2.setSubject("Jdbc and Hibernate");
//		t.begin();
//		em.merge(t2);
//		t.commit();
//		-------------------Updating the child Class-----------------------
//		Student s1=em.find(Student.class, "sanju");
//		s1.setAge(60);
//		t.begin();
//		em.merge(s1);
//		t.commit();
//		-------------------Deleting the parent Class-----------------------
//		Trainer t2=em.find(Trainer.class, "Shankar sir");
//		t.begin();
//		em.remove(t2);
//		t.commit();
//		-------------------Deleting the Child Class-----------------------
		Trainer t2=em.find(Trainer.class, "Kiran sir");
		List<Student> sl=t2.getSt();
		Iterator<Student> i=sl.iterator();
		while(i.hasNext())
		{
			Student s=i.next();
			if(s.getSName().equals("mala"))
			{
				i.remove();
			}
		}
		t2.setSt(sl);
		t.begin();
		em.merge(t2);
		t.commit();
		Student s3=em.find(Student.class, "mala");
		t.begin();
		em.remove(s3);
		t.commit();
	}

}
