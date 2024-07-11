package com.demo.deo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory ef=Persistence.createEntityManagerFactory("demo");
		EntityManager eManager=	ef.createEntityManager();
		eManager.getTransaction().begin();
		Employee e1=new Employee();
		//e1.setId(1);
		e1.setName("mahajan");
		e1.setCity("delhi");
		e1.setSalary(541265);
		eManager.persist(e1);
		eManager.getTransaction().commit();
		ef.close();
		eManager.close();
		
		System.out.println("Connection done");
	}
}
