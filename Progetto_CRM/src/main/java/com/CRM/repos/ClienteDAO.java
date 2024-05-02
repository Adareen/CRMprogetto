package com.CRM.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRM.entities.Cliente;

public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
