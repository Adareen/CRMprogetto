package com.CRM.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.entities.Cliente;

@Service
public interface ClienteService {
	
	List<Cliente> getCliente();
	Cliente addCliente(Cliente c);
	Cliente updateCliente(Cliente c);
	void delCliente(Cliente c);
	Cliente getCliente(Cliente c);

}
