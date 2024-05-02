package com.CRM.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.CRM.entities.TagCliente;

@Service
public interface TagClienteService {
	
	List<TagCliente> getTagCliente();
	TagCliente addTagCliente(TagCliente tc);
	TagCliente updateTagCliente(TagCliente tc);
	void delTagCliente(TagCliente tc);

}
