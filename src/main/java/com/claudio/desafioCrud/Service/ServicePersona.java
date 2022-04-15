package com.claudio.desafioCrud.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.claudio.desafioCrud.InterfaceService.ServiceInterfacePersona;
import com.claudio.desafioCrud.Modelo.Persona;
import com.claudio.desafioCrud.RepositoryPersona.RepositoryPersona;

@Service
public  class ServicePersona implements ServiceInterfacePersona {

	@Autowired
	private RepositoryPersona data;
	
	@Override
	public List<Persona> listar() {
		
		//casteo de la lista recibida
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> listarId(int id) {
		// TODO Auto-generated method stub
		
		return  data.findById(id);
		
	}

	
	@Override
	public int save(Persona InstanciaPersona) {
		int resultado=0;
		Persona persona=data.save(InstanciaPersona);
		if(!persona.equals(null)) {resultado=1;
		}
		return resultado;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
