package com.cg.services;

import com.cg.entities.Certificate;
import com.cg.repository.ICertificateRepository;
import com.cg.repository.ICertificateRepositoryImpl;

public class CertificateServiceImpl implements CertificateService {
	private ICertificateRepository cao;
	
	
	public CertificateServiceImpl() {
		super();
		cao=new ICertificateRepositoryImpl();
	}
	

	@Override
	public Certificate addCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.addCertificate(certificate);
		cao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		cao.beginTransaction();
		cao.updateCertificate(certificate);
		cao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(long id) {
		Certificate certificate =cao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(long id) {
		cao.beginTransaction();
		Certificate certificate=cao.deleteCertificate(id);
		cao.commitTransaction();
		return certificate;
	}

}
