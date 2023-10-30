package com.spring.start.swagger.rutas;

import java.util.ArrayList;
import java.util.List;

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

import com.spring.start.swagger.objetos.Alumno;

@RestController
public class Rutas {

	@Autowired
	private Alumno alumno;

	@GetMapping("/alumnado/{id}")
	public Alumno unAlumno(@PathVariable int id) {

		return alumno;
	}
	
	@GetMapping("/alumnado")
	public List<Alumno> todosAlumnos() {

		ArrayList<Alumno> listado = new ArrayList<Alumno>();
		
		for(int i=0; i<5;i++) {
			listado.add(alumno);
		}
		
		return listado;
	}


	@PostMapping("/alumnado")
	public ResponseEntity<Alumno> alumnoPost(@RequestBody Alumno alumno) {

		System.out.println("Alumno recibido para post");
		return ResponseEntity.status(HttpStatus.OK).body(alumno);
	}

	@PutMapping("/alumnado/{id}")
	public ResponseEntity<Alumno> udateAlumno(@RequestBody Alumno alumno, @PathVariable int id) {

		System.out.println("Recibido alumno para put");

		return ResponseEntity.status(HttpStatus.OK).body(alumno);
	}

	@DeleteMapping("/alumnado/{id}")
	public ResponseEntity<Alumno> deleteAlumno(@PathVariable int id) {

		System.out.println("Recibido alumno para delete");

		return ResponseEntity.status(HttpStatus.OK).body(null);
	}

}
