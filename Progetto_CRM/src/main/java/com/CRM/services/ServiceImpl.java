package com.CRM.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CRM.entities.Appuntamento;
import com.CRM.entities.Cliente;
import com.CRM.entities.NotaCliente;
import com.CRM.entities.Opportunita;
import com.CRM.entities.ServizioConsulenza;
import com.CRM.entities.TagCliente;
import com.CRM.entities.Utente;
import com.CRM.repos.AppuntamentoDAO;
import com.CRM.repos.ClienteDAO;
import com.CRM.repos.NotaClienteDAO;
import com.CRM.repos.OpportunitaDAO;
import com.CRM.repos.ServizioConsulenzaDAO;
import com.CRM.repos.TagClienteDAO;
import com.CRM.repos.UtenteDAO;

@Service
public class ServiceImpl implements AppuntamentoService, ClienteService, NotaClienteService, OpportunitaService,
		ServizioConsulenzaService, TagClienteService, UtenteService {
	
	@Autowired
	AppuntamentoDAO appuntamentoDao;
	
	@Autowired
	ClienteDAO clienteDao;
	
	@Autowired
	NotaClienteDAO notaClienteDao;
	
	@Autowired
	OpportunitaDAO opportunitaDao;
	
	@Autowired
	ServizioConsulenzaDAO servConsDao;
	
	@Autowired
	TagClienteDAO tagClienteDao;
	
	@Autowired
	UtenteDAO utenteDao;

	@Override
	public List<Utente> getUtente() {
		return utenteDao.findAll();
	}

	@Override
	public Utente addUtente(Utente u) {
		return utenteDao.save(u);
	}

	@Override
	public Utente updateUtente(Utente u) {
		return utenteDao.save(u);
	}

	@Override
	public void delUtente(Utente u) {
		utenteDao.delete(u);
	}

//	@Override
//	public Utente getUtente(Utente u) {
//		
//	}

	@Override
	public List<TagCliente> getTagCliente() {
		return tagClienteDao.findAll();
	}

	@Override
	public TagCliente addTagCliente(TagCliente tc) {
		return tagClienteDao.save(tc);
	}

	@Override
	public TagCliente updateTagCliente(TagCliente tc) {
		return tagClienteDao.save(tc);
	}

	@Override
	public void delTagCliente(TagCliente tc) {
		tagClienteDao.delete(tc);
	}

	@Override
	public List<ServizioConsulenza> getServizioConsulenza() {
		return servConsDao.findAll();
	}

	@Override
	public ServizioConsulenza addServizioConsulenza(ServizioConsulenza sc) {
		return servConsDao.save(sc);
	}

	@Override
	public ServizioConsulenza updateServizioConsulenza(ServizioConsulenza sc) {
		return servConsDao.save(sc);
	}

	@Override
	public void delServizioConsulenza(ServizioConsulenza ps) {
		servConsDao.delete(ps);

	}

	@Override
	public List<Opportunita> getOpportunita() {
		return opportunitaDao.findAll();
	}

	@Override
	public Opportunita addOpportunita(Opportunita o) {
		return opportunitaDao.save(o);
	}

	@Override
	public Opportunita updateOpportunita(Opportunita o) {
		return opportunitaDao.save(o);
	}

	@Override
	public void delOpportunita(Opportunita o) {
		opportunitaDao.delete(o);

	}

	@Override
	public List<NotaCliente> getNotaCliente() {
		return notaClienteDao.findAll();
	}

	@Override
	public NotaCliente addNotaCliente(NotaCliente nc) {
		return notaClienteDao.save(nc);
	}

	@Override
	public NotaCliente updateNotaCliente(NotaCliente nc) {
		return notaClienteDao.save(nc);
	}

	@Override
	public void delNotaCliente(NotaCliente nc) {
		notaClienteDao.delete(nc);
	}

	@Override
	public List<Cliente> getCliente() {
		return clienteDao.findAll();
	}

	@Override
	public Cliente addCliente(Cliente c) {
		return clienteDao.save(c);
	}

	@Override
	public Cliente updateCliente(Cliente c) {
		return clienteDao.save(c);
	}

	@Override
	public void delCliente(Cliente c) {
		clienteDao.delete(c);
	}

	@Override
	public Cliente getCliente(int id) {
		return clienteDao.findById(id).get();
	}

	@Override
	public List<Appuntamento> getAppuntamenti() {
		return appuntamentoDao.findAll();
	}

	@Override
	public Appuntamento addAppuntamento(Appuntamento p) {
		return appuntamentoDao.save(p);
	}

	@Override
	public Appuntamento updateAppuntamento(Appuntamento p) {
		return appuntamentoDao.save(p);
	}

	@Override
	public void delAppuntamento(Appuntamento p) {
		appuntamentoDao.delete(p);
	}

}
