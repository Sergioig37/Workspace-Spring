package com.spring.start.h2.escribe;

import com.spring.start.h2.libro.Libro;
import com.spring.start.h2.persona.Persona;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class Escribe {

	//el id único viene de la clase EscribeKey
	@EmbeddedId EscribeKey id;
	
	//relación que tiene con la otra tabla
	@ManyToOne
	//objeto de la EscribeKey
	@MapsId("idLibro")
	//nombre de la columna de los libros en EscribeKey
	@JoinColumn(name="idlibro")
	//objeto con el que conecta
	Libro libro;
	
	@ManyToOne
	//objeto de la EscribeKey
	@MapsId("idAutor")
	//nombre de la columna de los autores en EscribeKey
	@JoinColumn(name="idautor")
	//objeto con el que conecta
	Persona autor;
	
	
	private int rating;
	private float sueldo;
}
