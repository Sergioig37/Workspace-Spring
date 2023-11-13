package com.spring.start.h2.proyectos;

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

import com.spring.start.h2.alumnos.Alumnado;

@RestController
public class ProyectoController {

	@Autowired
	ProyectosDAO proyectoDAO;
	
	@GetMapping("/proyectos")
	public List<Proyectos> getProyectos(){
		
		return  (List<Proyectos>) proyectoDAO.findAll();
	}
	
	
	@PostMapping("/proyectos")
	public ResponseEntity<Proyectos> postProyecto(@RequestBody Proyectos proyecto){
		
		proyectoDAO.save(proyecto);
		return ResponseEntity.status(HttpStatus.CREATED).body(proyecto);
	}
	
	@DeleteMapping("/proyectos/{id}")
	public ResponseEntity<Proyectos> deleteProyecto(@PathVariable String id){
		
		Optional<Proyectos> proyecto = proyectoDAO.findById(id);
		if(proyecto.isPresent()) {
				proyectoDAO.delete(proyecto.get());
				return ResponseEntity.status(HttpStatus.OK).body(proyecto.get());
		}
	
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	
	@PutMapping("/proyectos/{id}")
	public ResponseEntity<Proyectos> putProyecto(@PathVariable String id,
												@RequestBody Proyectos proyecto){
		
		
		Optional<Proyectos> proyecto2 = proyectoDAO.findById(id);
		
		if(proyecto2.isPresent()) {
			
			proyectoDAO.save(proyecto);
			return ResponseEntity.status(HttpStatus.OK).body(proyecto);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}
}
