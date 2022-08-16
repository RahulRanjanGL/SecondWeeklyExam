package com.java.jpa.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class FindEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_JPA");
		 EntityManager em=emf.createEntityManager();
		 em.getTransaction().begin();
		
		 //insertion of data in table
		 EmployeeEntity e1=new EmployeeEntity();
		   e1.setEmpNo(123);
		   e1.setEmpName("Rahul Ranjan");
		   e1.setDesignation("Java Developer");
		   e1.setSalary(45000.50);
		   
		   
		   EmployeeEntity e2=new EmployeeEntity();
			   e2.setEmpNo(345);
			   e2.setEmpName("Vivek Gupta");
			   e2.setDesignation("DotNet Developer");
			   e2.setSalary(65000.00);
		   
		   EmployeeEntity e3= new EmployeeEntity();
			   e3.setEmpNo(178);
			   e3.setEmpName("Amit Mishra");
			   e3.setDesignation("Testing");
			   e3.setSalary(35000.50);
			   
		   EmployeeEntity e4= new EmployeeEntity();
			   e4.setEmpNo(980);
			   e4.setEmpName("Sunil Kumar");
			   e4.setDesignation("FrontEnd Developer");
			   e4.setSalary(33000.50);
		   
		   
		       em.persist(e1);
		       em.persist(e2);
		       em.persist(e3);
		       em.persist(e4);
		   
		   System.out.println("Data Inserted Successfully...");
		   System.out.println();
		   em.getTransaction().commit();
		       
		   //Fetch Data from table
	    Query q= em.createQuery("select emp from EmployeeEntity emp");
	    List <EmployeeEntity> list= q.getResultList();
		
		    for(EmployeeEntity e:list){
		    	System.out.println(e.getEmpNo()+" "+e.getEmpName()+" "+e.getDesignation()+" "+e.getSalary());
	         }
		    
		    System.out.println();
		    System.out.println("All Records Fetched successfully...");
	}

}
