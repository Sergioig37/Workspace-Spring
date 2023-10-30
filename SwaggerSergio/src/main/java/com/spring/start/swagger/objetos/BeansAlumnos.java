package com.spring.start.swagger.objetos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansAlumnos {

	@Bean
	 Alumno sergio() {
		Alumno sergio = new Alumno();
		sergio.setNombre("Sergio");
		sergio.setCiudad("Luarca");
		sergio.setEdad(19);
		
		return sergio;
	}
}
