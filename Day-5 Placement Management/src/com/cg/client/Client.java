package com.cg.client;

import com.cg.entities.Certificate;
import com.cg.entities.Student;
import com.cg.services.CertificateService;
import com.cg.services.CertificateServiceImpl;
import com.cg.services.StudentService;
import com.cg.services.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// Creating an object of all entity files
				Student student = new Student();
				StudentService service = new StudentServiceImpl();
				
				student.setId(1331);
				student.setName("Shabnam");
				student.setCollege("Pune University");
				student.setRoll(55);
				student.setQualification("BE");
				student.setCourse("CIS");
				student.setYear(2022);
				student.setHallTicketNo(321);
				
				Certificate certificate = new Certificate();
				certificate.setId(121);
				certificate.setYear(2020);
				
				
				// One to One ( Writing data to DB in One to One Mapping
				student.setCertificate(certificate);
				certificate.setStudent(student);
				
				
				service.addStudent(student);
				
				System.out.println("one student entry and one certificate entry is completed");
				
				
			}

		
		
	

}
