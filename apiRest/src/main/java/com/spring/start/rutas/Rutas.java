package com.spring.start.rutas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.Direccion;
import com.spring.start.objetos.GrupoCines;
import com.spring.start.objetos.Pelicula;
import com.spring.start.utilities.ArrayCineConstructor;

@RestController
public class Rutas {

	@Autowired
	Cine cineEjamplo;
	@Autowired
	private GrupoCines grupoCines;

	@GetMapping("/cines")
	public List<Cine> cinesWrite() {

		

		List<Cine> cines = grupoCines.getCines();

		return cines;
	}
	
	@GetMapping(value= {"/cine/{idCine}/pelicula"})
	public ResponseEntity<List<Pelicula>> sacarPeliculas(@PathVariable int idCine){
		
		

		
		if(grupoCines.getCine(idCine)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(grupoCines.getCine(idCine).getPeliculas());
		}
		
		
	}
	
	@GetMapping(value= {"/cine/{idCine}/pelicula/{idPelicula}"})
	public ResponseEntity<Pelicula> sacarPeliculaEspecifica(
			@PathVariable int idCine,
			@PathVariable int idPelicula){
		
		if(grupoCines.getCine(idCine)==null||grupoCines.getCine(idCine).getPelicula(idPelicula)==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
			
		}
		else {
			return ResponseEntity.status(HttpStatus.OK).body(grupoCines.getCine(idCine).getPelicula(idPelicula));
		}
		
		
	}

	/*
	@GetMapping(value = { "/cines/{id}" })
	public Cine unCine(@PathVariable int id) {

		Direccion direccion = new Direccion();

		direccion.setCalle("Genral Elorza 41");
		direccion.setCiudad("Oviedo");
		direccion.setCp("33002");

		return cineEjamplo;
	}+7
	/*
	 * @DeleteMapping(value={"/cines/{id}"}) public ResponseEntity<ArrayList<Cine>>
	 * deleteCine(@PathVariable int id) {
	 * 
	 * if(GrupoCines.comprobarExiste(id)==true) { GrupoCines.borrarCine(id); return
	 * ResponseEntity.status(HttpStatus.OK).body(GrupoCines.getCines()); } else {
	 * return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); }
	 * 
	 * }
	 */

	/*
	 * @PostMapping("/cines") public ResponseEntity<Cine> postCine(@RequestBody Cine
	 * cine) {
	 * 
	 * 
	 * //añado el cine a la base de datos/BBDDF System.out.println(cine);
	 * 
	 * return ResponseEntity.status((HttpStatus.)).body(cine); }
	 */

}
