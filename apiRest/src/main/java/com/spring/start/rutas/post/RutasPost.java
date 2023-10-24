package com.spring.start.rutas.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.GrupoCines;
import com.spring.start.objetos.Pelicula;

@RestController
public class RutasPost {

	@Autowired
	Pelicula peliculaEjemplo;
	@Autowired
	private GrupoCines grupoCines;

	@PostMapping("/cines/post")
	public void cinesPost(@RequestBody Cine cine){
		
		grupoCines = GrupoCines.getGrupoCines();
		
		grupoCines.addCine(cine);
		
		System.out.println(cine);
	}
	
	@PostMapping(value={"/cine/{idCine}/pelicula"})
	public ResponseEntity<List<Pelicula>> postPelicula(@PathVariable int idCine){
		
		grupoCines =  GrupoCines.getGrupoCines();
		
		if(grupoCines.getCine(idCine)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		else {
			Cine cine= grupoCines.getCine(idCine);
			cine.addPelicula(peliculaEjemplo);
			grupoCines.actualizarCine(cine);
			return ResponseEntity.status(HttpStatus.OK).body(null);
		}
		
	}
	
}
