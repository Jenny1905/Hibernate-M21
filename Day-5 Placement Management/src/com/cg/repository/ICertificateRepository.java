package com.cg.repository;

import com.cg.entities.Certificate;

public interface ICertificateRepository 
{
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(long id);
	Certificate deleteCertificate(long id);
	void beginTransaction() ;
	void commitTransaction();

}
