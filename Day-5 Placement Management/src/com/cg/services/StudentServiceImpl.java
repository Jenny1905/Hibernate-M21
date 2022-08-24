package com.cg.services;

import com.cg.entities.Certificate;
import com.cg.entities.Student;
import com.cg.repository.ICertificateRepository;
import com.cg.repository.ICertificateRepositoryImpl;
import com.cg.repository.IStudentRepository;
import com.cg.repository.IStudentRepositoryImpl;

public class StudentServiceImpl implements StudentService
{
	private IStudentRepository dao;
	//private ICertificateRepository cao;

	
	public StudentServiceImpl() {
		super();
		dao=new IStudentRepositoryImpl();
		//cao=new ICertificateRepositoryImpl();
	}

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student searchStudentById(long id) {
		Student student =dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicket(long ticketNo) {
		Student student =dao.searchStudentByHallTicket(ticketNo);
		return student;
	}

	/*@Override
	public boolean addCertificate(Certificate certificate) {
		dao.beginTransaction();
		cao.addCertificate(certificate);
		dao.commitTransaction();
		return true;
	}

	@Override
	public boolean updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		cao.updateCertificate(certificate);
		dao.commitTransaction();
		return true;
	}*/

	@Override
	public boolean deleteStudent(long id) {
		dao.beginTransaction();
		boolean res=dao.deleteStudent(id);
		dao.commitTransaction();
		return res;
	}
	

}
