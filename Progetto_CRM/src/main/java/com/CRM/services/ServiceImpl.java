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
	ClienteDAO clienteDao;
	NotaClienteDAO notaClienteDao;
	OpportunitaDAO opportunitaDao;
	ServizioConsulenzaDAO servConsDao;
	TagClienteDAO tagClienteDao;
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
		// TODO Auto-generated method stub

	}

	@Override
	public Utente getUtente(Utente u) {
		// TODO Auto-generated method stub
		return null;
	}

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
		// TODO Auto-generated method stub
		return tagClienteDao.save(tc);
	}

	@Override
	public void delTagCliente(TagCliente tc) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public Cliente getCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub

	}

}
