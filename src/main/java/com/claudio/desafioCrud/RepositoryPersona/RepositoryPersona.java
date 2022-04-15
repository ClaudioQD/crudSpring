package com.claudio.desafioCrud.RepositoryPersona;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.claudio.desafioCrud.Modelo.Persona;

@Repository
public interface RepositoryPersona extends CrudRepository<Persona, Integer> {

	
	
}
