package com.spring.start.h2.persona;

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

import com.spring.start.h2.coche.Coche;
import com.spring.start.h2.coche.CocheDAO;

@RestController
public class PersonaController {

	
	@Autowired
	PersonaDAO personaDAO;
	@Autowired
	CocheDAO cocheDAO;
	
	
	@GetMapping("/persona")
	public List<Persona> getPersona() {
		
		personaDAO.findAll();
		
		return (List<Persona>) personaDAO.findAll();
		
		
	}
	
	
	@PostMapping("/persona")
	public ResponseEntity<Persona> postPersona(@RequestBody Persona persona) {
		
		personaDAO.save(persona);
		for(Coche coche: persona.getCoches()){
			coche.setPersona(persona);
			cocheDAO.save(coche);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(persona);
	}

	
	@DeleteMapping("/persona/{id}")
	public ResponseEntity<Persona> deletePersona(@PathVariable long id) {
		
		Optional<Persona> persona = personaDAO.findById(id);
		if(persona.isPresent()) {
			
			personaDAO.delete(persona.get());
			return ResponseEntity.status(HttpStatus.FOUND).body(persona.get());
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);	
	}
	
	
	@GetMapping("/t/consultas/page/{n}")
	public ResponseEntity<List<Persona>> pagePersona(){
		
		
		return ResponseEntity.status(HttpStatus.OK).body(null);
	}
	
	/*
	@GetMapping("/persona/consulta/{nombre}/{edad}")
	public List<Persona> consulta(@PathVariable String nombre,
			@PathVariable int edad){
		
		return (List<Persona>) personaDAO.findByNombreAndEdadLessThanEqual(nombre,edad);
		
	}*/
	
	
	@GetMapping("/persona/consulta/{id}/{nombre}")
	public Persona consulta(@PathVariable Long id,
							 @PathVariable String nombre) {
		
		Persona persona = personaDAO.findByIdAndNombre(id, nombre);
		
		return persona;
		
	}
	
	@PutMapping("/persona/{id}")
	public ResponseEntity<Persona> putPersona(@PathVariable Long id,
												@RequestBody Persona persona) {
		
		Optional<Persona> personaBBDD = personaDAO.findById(id);
		if(personaBBDD.isPresent()) {
			/*
			personaBBDD.get().setCiudad(persona.getCiudad());
			personaBBDD.get().setNombre(persona.getNombre());
			personaBBDD.get().setId(persona.getId());
			personaDAO.save(personaBBDD.get());
			*/
			personaDAO.delete(personaBBDD.get());
			personaDAO.save(persona);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(persona);
			
		}
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}
	
	
	
	
	
	
	
}
