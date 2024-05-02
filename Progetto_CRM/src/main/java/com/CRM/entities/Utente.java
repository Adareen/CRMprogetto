package com.CRM.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Utente {
	
//	ID_Utente (PK)
//	Nome_Utente
//	Ruolo (Pubblico, Registrato, Amministratore)
//	Email
//	Password
//	Data_Registrazione
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDUtente;
	
	private String nomeUtente, ruolo, email, password;
	private LocalDate dataRegistrazione;
	
	public int getIDUtente() {
		return IDUtente;
	}
	public void setIDUtente(int iDUtente) {
		IDUtente = iDUtente;
	}
	public String getNomeUtente() {
		return nomeUtente;
	}
	public void setNomeUtente(String nomeUtente) {
		this.nomeUtente = nomeUtente;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDataRegistrazione() {
		return dataRegistrazione;
	}
	public void setDataRegistrazione(LocalDate dataRegistrazione) {
		this.dataRegistrazione = dataRegistrazione;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Utente [IDUtente=");
		builder.append(IDUtente);
		builder.append(", nomeUtente=");
		builder.append(nomeUtente);
		builder.append(", ruolo=");
		builder.append(ruolo);
		builder.append(", email=");
		builder.append(email);
		builder.append(", password=");
		builder.append(password);
		builder.append(", dataRegistrazione=");
		builder.append(dataRegistrazione);
		builder.append("]");
		return builder.toString();
	}
	
	

}
