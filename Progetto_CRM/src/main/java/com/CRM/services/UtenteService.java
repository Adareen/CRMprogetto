package com.CRM.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.entities.Utente;

@Service
public interface UtenteService {
	
	List<Utente> getUtente();
	Utente addUtente(Utente u);
	Utente updateUtente(Utente u);
	void delUtente(Utente u);
//	Utente getUtente(Utente u);

}
