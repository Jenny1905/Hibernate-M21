package com.cg.services;

import com.cg.entities.Certificate;
import com.cg.entities.Student;

public interface StudentService 
{
	Student addStudent(Student student);
	Student updateStudent(Student student);
	Student searchStudentById(long id);
	Student searchStudentByHallTicket(long ticketNo);
	//boolean addCertificate(Certificate cerfificate);
	//boolean updateCertificate(Certificate certificate);
	boolean deleteStudent(long id);

}
