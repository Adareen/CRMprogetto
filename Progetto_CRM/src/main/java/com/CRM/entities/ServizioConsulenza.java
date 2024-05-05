package com.CRM.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "servizi_consulenza")
public class ServizioConsulenza {
	
//	ID_Servizio (PK)
//	Nome_Servizio
//	Descrizione
//	Prezzo
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Servizio;
	
	private String nomeServizio, descrizione;
	private double prezzo;
	
	public int getIDServizio() {
		return ID_Servizio;
	}
	public void setIDServizio(int iDServizio) {
		ID_Servizio = iDServizio;
	}
	public String getNomeServizio() {
		return nomeServizio;
	}
	public void setNomeServizio(String nomeServizio) {
		this.nomeServizio = nomeServizio;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServizioConsulenza [IDServizio=");
		builder.append(ID_Servizio);
		builder.append(", nomeServizio=");
		builder.append(nomeServizio);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}

	
	
}
