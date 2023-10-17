package com.spring.start.rutas.delete;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.GrupoCines;

@Controller
public class RutasDelete {

	@Autowired
	private GrupoCines grupoCines;
	
	@DeleteMapping(value={"/cines/{id}"})
	public ResponseEntity<List<Cine>> deleteCine(@PathVariable int id) {
		
		
		GrupoCines grupoCine =  GrupoCines.getGrupoCines();
		
		if(grupoCine.comprobarExiste(id)==true) {
			grupoCine.borrarCine(id);
			return ResponseEntity.status(HttpStatus.OK).body(grupoCine.getCines());
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	
	}
}
