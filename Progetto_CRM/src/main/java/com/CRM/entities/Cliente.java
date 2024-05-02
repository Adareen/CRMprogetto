package com.CRM.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

//	ID_Cliente (PK)
//	Nome_Azienda
//	Referente_Aziendale
//	Categoria_Merceologica
//	Tipologia_Cliente
//	Utente_Associato (FK: Utente.ID_Utente)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDCliente;
	
	private String nomeAzienda, referenteAziendale, categoriaMerceologica, tipologiaCliente;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_Utente")
	private Utente utenteAssociato;
	
	@OneToMany(mappedBy = "cliente")
	private Set<ClienteTag> clienteTags;

	public int getIDCliente() {
		return IDCliente;
	}

	public void setIDCliente(int iDCliente) {
		IDCliente = iDCliente;
	}

	public String getNomeAzienda() {
		return nomeAzienda;
	}

	public void setNomeAzienda(String nomeAzienda) {
		this.nomeAzienda = nomeAzienda;
	}

	public String getReferenteAziendale() {
		return referenteAziendale;
	}

	public void setReferenteAziendale(String referenteAziendale) {
		this.referenteAziendale = referenteAziendale;
	}

	public String getCategoriaMerceologica() {
		return categoriaMerceologica;
	}

	public void setCategoriaMerceologica(String categoriaMerceologica) {
		this.categoriaMerceologica = categoriaMerceologica;
	}

	public String getTipologiaCliente() {
		return tipologiaCliente;
	}

	public void setTipologiaCliente(String tipologiaCliente) {
		this.tipologiaCliente = tipologiaCliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [IDCliente=");
		builder.append(IDCliente);
		builder.append(", nomeAzienda=");
		builder.append(nomeAzienda);
		builder.append(", referenteAziendale=");
		builder.append(referenteAziendale);
		builder.append(", categoriaMerceologica=");
		builder.append(categoriaMerceologica);
		builder.append(", tipologiaCliente=");
		builder.append(tipologiaCliente);
		builder.append(", utenteAssociato=");
		builder.append(utenteAssociato);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
