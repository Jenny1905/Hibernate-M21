package com.cg.singleinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritanceTest {

	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create one Employee
		Employee emp=new Employee();
		emp.setName("Janhvi");
		emp.setSalary(25000);
		em.persist(emp);// to add the row
		
		//create second Employee
		Employee emp1=new Employee();
		emp1.setName("Krishna");
		emp1.setSalary(45000);
		em.persist(emp1);
		
		//create one manager
		Manager m=new Manager();
		m.setName("Parag");
		m.setSalary(80000);
		m.setDeptName("IT");
		em.persist(m);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully in the Database");
		em.close();
		factory.close();
	
	}

}
