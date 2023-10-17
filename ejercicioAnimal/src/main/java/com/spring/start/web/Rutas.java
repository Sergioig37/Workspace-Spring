package com.spring.start.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Rutas {

	
	@PostMapping("/animal")
	@ResponseBody
	public String postAnimal(@RequestParam int id,
			@RequestParam String nombre,
			@RequestParam String raza,
			@RequestParam String fechaUltimaVacuna, 
			@RequestParam String localidadResidencia) {
		
		
		Animal miAnimal = new Animal(id, nombre,raza,fechaUltimaVacuna,localidadResidencia);
		System.out.println(miAnimal);
		
		return"";
	}
}
