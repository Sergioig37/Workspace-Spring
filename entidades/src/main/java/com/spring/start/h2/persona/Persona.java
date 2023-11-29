package com.spring.start.h2.persona;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.spring.start.h2.coche.Coche;
import com.spring.start.h2.libro.Libro;
import com.spring.start.h2.escribe.Escribe;
//esto indica que la clase es una entidad
//o sea, una tabla
@Entity
public class Persona {

	//indica que atributo va a ser el id de cada objeto en la tabla
	@Id
	//indica el modo de generaciíon, en este caso IDENTITY significa que va a 
	//ser autoincremental
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nombre;
	private String ciudad;
	private int edad;
	private int altura;
	
	@OneToMany(mappedBy = "persona", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(value = FetchMode.SUBSELECT)
	@JsonManagedReference
	private List<Coche> coches = new ArrayList<Coche>();

	@OneToMany(targetEntity=Escribe.class,
			mappedBy="autor")
	private Set<Libro> libros = new HashSet<Libro>();
	
	
	
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}
	
	
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	
	public List<Coche> getCoches() {
		return coches;
	}

	public Set<Libro> getLibros() {
		return libros;
	}


	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

}
