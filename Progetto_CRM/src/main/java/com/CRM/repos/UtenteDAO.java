package com.CRM.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
