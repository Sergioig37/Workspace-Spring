package com.spring.start.rutas.put;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.GrupoCines;

@Controller
public class RutasPut {

	@Autowired
	private GrupoCines grupoCines;
	
	@PutMapping("/cines/put")
	public ResponseEntity<Cine> updateCine(@RequestBody Cine cine) {
		
		grupoCines = GrupoCines.getGrupoCines();
		
		grupoCines.actualizarCine(cine);
		
		return ResponseEntity.status(HttpStatus.OK).body(cine);
	}
}
