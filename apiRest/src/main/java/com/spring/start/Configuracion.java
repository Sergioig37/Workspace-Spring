package com.spring.start;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.start.objetos.Cine;
import com.spring.start.objetos.Pelicula;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Configuracion {

	@Bean(name="cine1")
	  Cine miCine1() {
		
		return new Cine(999,"GlobalCinema", 10000);
	}
	
	@Bean(name="peliculaZ")
	Pelicula miPeliculaZ() {
		
		return new Pelicula(8, "El hombre simio", "Fantasía", "Cristopher Nolan");
	}
	
	
}
