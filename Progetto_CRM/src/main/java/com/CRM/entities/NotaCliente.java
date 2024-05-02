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
@Table(name = "note_cliente")
public class NotaCliente {
	
//	ID_Nota (PK)
//	ID_Cliente (FK: Cliente.ID_Cliente)
//	Testo_Nota
//	Data_Registrazione
//	Utente_Registrante (FK: Utente.ID_Utente)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDNota;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="ID_Cliente")
	private Cliente cliente;
	
	private String testoNota;
	private LocalDate dataRegistrazione;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name="ID_Utente")
	private Utente utenteRegistrante;

	public int getIDNota() {
		return IDNota;
	}

	public void setIDNota(int iDNota) {
		IDNota = iDNota;
	}

	public String getTestoNota() {
		return testoNota;
	}

	public void setTestoNota(String testoNota) {
		this.testoNota = testoNota;
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
		builder.append("NotaCliente [IDNota=");
		builder.append(IDNota);
		builder.append(", IDCliente=");
		builder.append(cliente);
		builder.append(", testoNota=");
		builder.append(testoNota);
		builder.append(", dataRegistrazione=");
		builder.append(dataRegistrazione);
		builder.append(", utenteRegistrante=");
		builder.append(utenteRegistrante);
		builder.append("]");
		return builder.toString();
	}
	
	

}
