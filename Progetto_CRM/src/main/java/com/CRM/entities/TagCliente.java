package com.CRM.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tag_cliente")
public class TagCliente {
	
//	ID_Tag (PK)
//	Nome_Tag
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IDTag;
	
	private String nomeTag;
	
	@OneToMany(mappedBy = "tag")
	private Set<ClienteTag> clienteTags;

	public int getIDTag() {
		return IDTag;
	}

	public void setIDTag(int iDTag) {
		IDTag = iDTag;
	}

	public String getNomeTag() {
		return nomeTag;
	}

	public void setNomeTag(String nomeTag) {
		this.nomeTag = nomeTag;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TagCliente [IDTag=");
		builder.append(IDTag);
		builder.append(", nomeTag=");
		builder.append(nomeTag);
		builder.append("]");
		return builder.toString();
	}
	
	

}
