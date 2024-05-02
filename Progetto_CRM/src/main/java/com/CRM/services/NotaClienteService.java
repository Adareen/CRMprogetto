package com.CRM.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.entities.NotaCliente;

@Service
public interface NotaClienteService {
	
	List<NotaCliente> getNotaCliente();
	NotaCliente addNotaCliente(NotaCliente nc);
	NotaCliente updateNotaCliente(NotaCliente nc);
	void delNotaCliente(NotaCliente nc);

}
