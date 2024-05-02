package com.CRM.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.entities.Opportunita;

@Service
public interface OpportunitaService {
	
	List<Opportunita> getOpportunita();
	Opportunita addOpportunita(Opportunita o);
	Opportunita updateOpportunita(Opportunita o);
	void delOpportunita(Opportunita o);

}
