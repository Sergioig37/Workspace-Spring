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
import com.spring.start.objetos.Pelicula;

@RestController
public class RutasDelete {

	@Autowired
	private GrupoCines grupoCines;
	
	@DeleteMapping(value={"/cines/{id}"})
	public ResponseEntity<List<Cine>> deleteCine(@PathVariable int id) {
		
		
		
		
		if(grupoCines.comprobarExiste(id)==true) {
			grupoCines.borrarCine(id);
			return ResponseEntity.status(HttpStatus.OK).body(grupoCines.getCines());
		}
		else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	
	}
	
	@DeleteMapping(value={"/cine/{idCine}/pelicula/{idPelicula}"})
	public ResponseEntity<Pelicula> deletePelicula(@PathVariable int idCine,
			@PathVariable int idPelicula){

		
		
		if(grupoCines.getCine(idCine)==null||grupoCines.getCine(idCine).getPelicula(idPelicula)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		else {
			Cine cine= grupoCines.getCine(idCine);
			 cine.deletePelicula(idPelicula);
			grupoCines.actualizarCine(cine);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		}
		
		
		
	}
}
