package Servlet_validation_Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Servlet_validation_Dto.Dto;

public class Dao {
	EntityManagerFactory e=Persistence.createEntityManagerFactory("dev");
	EntityManager m=e.createEntityManager();
	EntityTransaction t=m.getTransaction();
	
	
	public String signup(Dto d1) {
		t.begin();
		m.persist(d1);
		t.commit();
		return "data is inserted successfully";
		
	}
	
	public Dto login(String email) {
	//	System.out.println(email);
		Dto e1=m.find(Dto.class, email);
		//System.out.println(e1.getPassword());
		return e1;
	}
}
