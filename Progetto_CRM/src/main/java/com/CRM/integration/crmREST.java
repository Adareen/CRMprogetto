package com.CRM.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRM.entities.Appuntamento;
import com.CRM.entities.Cliente;
import com.CRM.entities.NotaCliente;
import com.CRM.entities.Opportunita;
import com.CRM.entities.ServizioConsulenza;
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
	
	@Autowired
	ClienteService clienteService;
	
	@Autowired
	NotaClienteService notaClienteService;
	
	@Autowired
	OpportunitaService opportunitaService;
	
	@Autowired
	ServizioConsulenzaService servConsService;
	
	@Autowired
	TagClienteService tagClienteService;
	
	@Autowired
	UtenteService utenteService;
	
	@GetMapping("appuntamenti")
	public List<Appuntamento> getAppuntamenti(){
		return appuntamentoService.getAppuntamenti();
	}
	
	@PostMapping("appuntamenti")
	public Appuntamento addAppuntamento(Appuntamento a) {
		return appuntamentoService.addAppuntamento(a);
	}
	
	@GetMapping("clienti")
	public List<Cliente> getClienti(){
		return clienteService.getCliente();
	}
	
//	@PatchMapping("clienti/{id}")
//	public ResponseEntity<Persona> patchPersona(@PathVariable double punteggioTotale, @PathVariable int id){
//		try {
//			Persona p = service.getPersonaById(id) ;
//			p.setPunteggioTotale(punteggioTotale);
//			return new ResponseEntity<Persona>(service.updatePersona(p),HttpStatus.OK);
//			
//		} catch (Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//		
//	};
	
	@PostMapping("clienti")
	public Cliente addCliente(Cliente c) {
		return clienteService.addCliente(c);
	}
	
	@GetMapping("noteClienti")
	public List<NotaCliente> getNotaCliente(){
		return notaClienteService.getNotaCliente();
	}
	
	@PostMapping("noteClienti")
	public NotaCliente addNotaCliente(NotaCliente nc) {
		return notaClienteService.addNotaCliente(nc);
	}
	
	@GetMapping("opportunita")
	public List<Opportunita> getOpportunita(){
		return opportunitaService.getOpportunita();
	}
	
	@PostMapping("opportunita")
	public Opportunita addOpportunita(Opportunita o) {
		return opportunitaService.addOpportunita(o);
	}
	
	@GetMapping("servCons")
	public List<ServizioConsulenza> getServCons(){
		return servConsService.getServizioConsulenza();
	}
	
	@PostMapping("servCons")
	public ServizioConsulenza addServCons(ServizioConsulenza sc) {
		return servConsService.addServizioConsulenza(sc);
	}

	@GetMapping("utenti")
	public List<Utente> getUtente(){
		return utenteService.getUtente();
	}
	
	@PostMapping("utenti")
	public Utente addUtente(Utente u) {
		return utenteService.addUtente(u);
	}
	

}
