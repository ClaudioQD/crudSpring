package com.claudio.desafioCrud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	
	
}
