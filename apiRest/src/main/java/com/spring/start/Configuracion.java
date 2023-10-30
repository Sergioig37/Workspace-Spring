package com.spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.Pelicula;



@Configuration
public class Configuracion {

	@Bean("cine1")
	  Cine miCine1() {
		
		return new Cine(999,"GlobalCinema", 10000);
	}
	
	@Bean("peliculaZ")
	Pelicula miPeliculaZ() {
		
		return new Pelicula(8, "El hombre simio", "Fantasía", "Cristopher Nolan");
	}
	
	
}
