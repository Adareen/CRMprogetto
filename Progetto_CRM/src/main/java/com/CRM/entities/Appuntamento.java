package com.CRM.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "appuntamenti")
public class Appuntamento {
	
//	ID_Appuntamento (PK)
//	ID_Cliente (FK: Cliente.ID_Cliente)
//	Data_Appuntamento
//	Descrizione
//	Utente_Associato (FK: Utente.ID_Utente)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Appuntamento;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_Cliente")
	private Cliente cliente;
	
	private LocalDate dataAppuntamento;
	private String descrizione;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "Utente_Associato")
	private Utente utenteAssociato;

	public int getIDAppuntamento() {
		return ID_Appuntamento;
	}

	public void setIDAppuntamento(int iDAppuntamento) {
		ID_Appuntamento = iDAppuntamento;
	}

	public LocalDate getDataAppuntamento() {
		return dataAppuntamento;
	}

	public void setDataAppuntamento(LocalDate dataAppuntamento) {
		this.dataAppuntamento = dataAppuntamento;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Appuntamento [IDAppuntamento=");
		builder.append(ID_Appuntamento);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", dataAppuntamento=");
		builder.append(dataAppuntamento);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", utenteAssociato=");
		builder.append(utenteAssociato);
		builder.append("]");
		return builder.toString();
	}
	
	

}
