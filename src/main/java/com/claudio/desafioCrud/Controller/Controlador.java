package com.claudio.desafioCrud.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.claudio.desafioCrud.InterfaceService.ServiceInterfacePersona;
import com.claudio.desafioCrud.Modelo.Persona;


@Controller 
@RequestMapping
public class Controlador {

	@Autowired
	private ServiceInterfacePersona service;
	
	@GetMapping("/listar")
	public String listar(Model model){
		List<Persona>personas=service.listar();
		model.addAttribute("personas", personas);
		return"home";
			
	}
	
	@GetMapping("/new")
	public String agregar(Model model ){
		model.addAttribute("persona", new Persona());
		return"form";
		
	}
	@PostMapping("/save")
	public String save( @Valid Persona p, Model model) {
		
		service.save(p);
		return "redirect:/listar";
		
	}
	@GetMapping("/editar/{id}")
	public String editar( @PathVariable int id ,Model model) {
		Optional<Persona>persona=service.listarId(id);
		model.addAttribute("persona", persona);
		return"form";
		
		
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable int id) {
		service.delete(id);
		return"redirect:/listar";
	}
	
	
	
}
