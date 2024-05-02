package com.CRM.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.entities.Appuntamento;

@Service
public interface AppuntamentoService {
	
	List<Appuntamento> getAppuntamenti();
	Appuntamento addAppuntamento(Appuntamento p);
	Appuntamento updateAppuntamento(Appuntamento p);
	void delAppuntamento(Appuntamento p);
	

}
