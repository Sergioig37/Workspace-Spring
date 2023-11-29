package com.spring.start.clase;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropiedadesController {

	@Autowired
	PropiedadesDAO propiedadesDAO;
	
	@GetMapping("/propiedades/consulta")
	public ResponseEntity<List<Propiedades>> getPropiedades(@RequestParam int precioMin,
														@RequestParam int precioMax){
		
		return ResponseEntity.status(HttpStatus.OK).body((List<Propiedades>)propiedadesDAO.findByPrecioBetween(precioMin, precioMax));
	}
	@GetMapping("/propiedades/consulta/{caracter}")
	public ResponseEntity<List<Propiedades>> getPropiedadesCaracter(@PathVariable String caracter){
		
		return ResponseEntity.status(HttpStatus.OK).body((List<Propiedades>)propiedadesDAO.findByLocalizacionEndingWith(caracter));
	}
	@GetMapping("/propiedades/consultaAsc")
	public ResponseEntity<List<Propiedades>> getPropiedadesAsc(@RequestParam int precioMin,
														@RequestParam int precioMax){
		
		return ResponseEntity.status(HttpStatus.OK).body((List<Propiedades>)propiedadesDAO.findByPrecioBetweenOrderByPrecioAsc(precioMin, precioMax));
	}
	
	@GetMapping("/propiedades/consultaExcluyente")
	public ResponseEntity<List<Propiedades>> getPropiedadesExc(){
		
		
		List<Integer> precios = new ArrayList<Integer>();
		precios.add(20000);
		precios.add(50000);
		precios.add(70000);
		
		return ResponseEntity.status(HttpStatus.OK).body((List<Propiedades>)propiedadesDAO.findByPrecioNotIn(precios));
	}
	
	

	@GetMapping("/propiedades/consultaIgnore/{nombre}")
	public ResponseEntity<List<Propiedades>> getPropiedadesIgnore(@PathVariable String nombre){
		
		
		return ResponseEntity.status(HttpStatus.OK).body((List<Propiedades>)propiedadesDAO.findByLocalizacionIgnoreCase(nombre));
	}
	
	
	
	
}
