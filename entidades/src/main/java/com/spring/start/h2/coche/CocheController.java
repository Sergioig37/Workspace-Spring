package com.spring.start.h2.coche;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.start.h2.persona.Persona;
import com.spring.start.h2.persona.PersonaDAO;

@RestController
public class CocheController {

	
	@Autowired
	CocheDAO cocheDAO;
	
	
	@GetMapping("/coche")
	public List<Coche> getCoche() {
		
		cocheDAO.findAll();
		
		return (List<Coche>) cocheDAO.findAll();
		
		
	}
	
	
}
