package com.CRM.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente_Tag")
public class ClienteTag {
	
//	ID_Cliente_Tag (PK)
//	ID_Cliente (FK: Cliente.ID_Cliente)
//	ID_Tag (FK: Tag_Cliente.ID_Tag)
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_ClienteTag;
	
	@ManyToOne
	@JoinColumn(name = "ID_Cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "ID_Tag")
	private TagCliente tag;


	
	

}
