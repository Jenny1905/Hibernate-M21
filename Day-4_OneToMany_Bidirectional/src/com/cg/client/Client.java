package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.cg.entities.Department;
import com.cg.entities.Employee;


public class Client
{
	public static void main(String[] args)
	{
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		//create a new department
		Department department = new Department();
		department.setId(10);
		department.setName("Sales");
		
		//create a new department
		Department department1 = new Department();
		department1.setId(12);
		department1.setName("IT");
		
		//create two instances of employees
		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setName("Priya Sharma");
		e1.setSalary(4500);
		
		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setName("Dinesh Kumar");
		e2.setSalary(5500);
		
		//add both employees to department
		department.addEmployee(e1);
		department1.addEmployee(e2);
		
		//craete(save) department and its employees using entity manager(persist)
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();
		em.close();
		factory.close();
	}


}
