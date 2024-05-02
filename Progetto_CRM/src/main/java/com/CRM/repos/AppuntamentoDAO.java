package com.CRM.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.entities.Appuntamento;

public interface AppuntamentoDAO extends JpaRepository<Appuntamento, Integer> {

}
