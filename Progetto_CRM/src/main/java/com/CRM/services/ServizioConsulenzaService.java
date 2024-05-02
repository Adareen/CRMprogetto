package com.CRM.services;

import java.util.List;

import com.CRM.entities.ServizioConsulenza;

public interface ServizioConsulenzaService {
	
	List<ServizioConsulenza> getServizioConsulenza();
	ServizioConsulenza addServizioConsulenza(ServizioConsulenza sc);
	ServizioConsulenza updateServizioConsulenza(ServizioConsulenza sc);
	void delServizioConsulenza(ServizioConsulenza ps);
}
