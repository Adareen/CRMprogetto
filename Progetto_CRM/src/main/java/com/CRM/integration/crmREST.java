package com.CRM.integration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.services.AppuntamentoService;
import com.CRM.services.ClienteService;
import com.CRM.services.NotaClienteService;
import com.CRM.services.OpportunitaService;
import com.CRM.services.ServizioConsulenzaService;
import com.CRM.services.TagClienteService;
import com.CRM.services.UtenteService;

@RestController
@RequestMapping("api")
public class crmREST {
	
	@Autowired
	AppuntamentoService appuntamentoService;
	ClienteService clienteService;
	NotaClienteService notaClienteService;
	OpportunitaService opportunitaService;
	ServizioConsulenzaService servConsService;
	TagClienteService tagClienteService;
	UtenteService utenteService;
	
	

}
