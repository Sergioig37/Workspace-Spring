package com.spring.start.h2.alumnos;

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

@RestController
public class AlumnadoController {

	
	//para manejarnos con la base de datos de alumnos
	@Autowired
	AlumnadoDAO alumnadoDAO;
	
	//saca ub listado de todas las alumno
	@GetMapping("/alumnado")
	public List<Alumnado> getAlumnado(){
		
		
		
		return  (List<Alumnado>) alumnadoDAO.findAll();
	}
	
	
	@PostMapping("/alumnado")
	public ResponseEntity<Alumnado> postPersona(@RequestBody Alumnado alumno){
		
		alumnadoDAO.save(alumno);
		return ResponseEntity.status(HttpStatus.CREATED).body(alumno);
	}
	
	@DeleteMapping("/alumnado/{id}")
	public ResponseEntity<Alumnado> deleteAlumno(@PathVariable String id){
		
		Optional<Alumnado> alumno = alumnadoDAO.findById(id);
		if(alumno.isPresent()) {
				alumnadoDAO.delete(alumno.get());
				return ResponseEntity.status(HttpStatus.OK).body(alumno.get());
		}
	
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
	}
	
	@PutMapping("/alumnado/{id}")
	public ResponseEntity<Alumnado> putAlumno(@PathVariable String id,
												@RequestBody Alumnado alumno){
		
		
		Optional<Alumnado> alumno2 = alumnadoDAO.findById(id);
		
		if(alumno2.isPresent()) {
			
			alumnadoDAO.save(alumno);
			return ResponseEntity.status(HttpStatus.OK).body(alumno);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
	}
}
