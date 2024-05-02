package com.CRM.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.entities.NotaCliente;

public interface NotaClienteDAO extends JpaRepository<NotaCliente, Integer> {

}
