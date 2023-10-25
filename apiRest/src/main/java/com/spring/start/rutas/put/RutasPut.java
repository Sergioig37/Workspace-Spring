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
import com.spring.start.objetos.Pelicula;

@Controller
public class RutasPut {

	@Autowired
	Pelicula peliculaEjemplo;
	@Autowired
	private GrupoCines grupoCines;
	
	@PutMapping("/cines/put")
	public ResponseEntity<Cine> updateCine(@RequestBody Cine cine) {
		
		
		grupoCines.actualizarCine(cine);
		
		return ResponseEntity.status(HttpStatus.OK).body(cine);
	}
	
	@PutMapping(value={"/cine/{idCine}/pelicula/{idPelicula}"})
	public ResponseEntity<Pelicula> putPelicula(@PathVariable int idCine,
			@PathVariable int idPelicula 
			,@RequestBody Pelicula pelicula){
		
		
		
		if(grupoCines.getCine(idCine)==null||grupoCines.getCine(idCine).getPelicula(idPelicula)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		else {
			
			Cine cine= grupoCines.getCine(idCine);
			cine.updatePelicula(idPelicula, pelicula);
			grupoCines.actualizarCine(cine);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		}
		
	}
}
