package com.claudio.desafioCrud.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.claudio.desafioCrud.Modelo.Persona;

public interface ServiceInterfacePersona   {

	public List<Persona>listar();
	public Optional<Persona>listarId(int id);
	public int save(Persona InstanciaPersona);
	public void delete(int id);
}

