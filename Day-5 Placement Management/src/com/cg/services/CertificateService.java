package com.cg.services;

import com.cg.entities.Certificate;

public interface CertificateService
{
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(long id);
	Certificate deleteCertificate(long id);

}
