package com.CRM.entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "opportunità")
public class Opportunita {
	
//	ID_Opportunità (PK)
//	ID_Cliente (FK: Cliente.ID_Cliente)
//	Descrizione_Opportunità
//	Data_Inserimento
//	Stato
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Opportunita;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_Cliente")
	private Cliente cliente;
	
	@Column(name="Descrizione_Opportunità")
	private String descrizioneOpportunita;
	private LocalDate dataInserimento;
	private String stato;
	
	public int getIDOpportunita() {
		return ID_Opportunita;
	}
	public void setIDOpportunita(int iDOpportunita) {
		ID_Opportunita = iDOpportunita;
	}
	public String getDescrizioneOpportunita() {
		return descrizioneOpportunita;
	}
	public void setDescrizioneOpportunita(String descrizioneOpportunita) {
		this.descrizioneOpportunita = descrizioneOpportunita;
	}
	public LocalDate getDataInserimento() {
		return dataInserimento;
	}
	public void setDataInserimento(LocalDate dataInserimento) {
		this.dataInserimento = dataInserimento;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Opportunita [IDOpportunita=");
		builder.append(ID_Opportunita);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", descrizioneOpportunita=");
		builder.append(descrizioneOpportunita);
		builder.append(", dataInserimento=");
		builder.append(dataInserimento);
		builder.append(", stato=");
		builder.append(stato);
		builder.append("]");
		return builder.toString();
	}
	
	

}
