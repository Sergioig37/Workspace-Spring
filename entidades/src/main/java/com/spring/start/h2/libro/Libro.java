package com.spring.start.h2.libro;

import java.util.HashSet;
import java.util.Set;

import com.spring.start.h2.persona.Persona;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import com.spring.start.h2.escribe.Escribe;

@Entity
public class Libro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String ISBN;
	private String titulo;
	
	@OneToMany(targetEntity=Escribe.class,
			mappedBy="libro")
	private Set<Persona> autores = new HashSet<Persona>();
	//este join table se pone en la clase
	//que no tiene el mappedBy
	
	//esto de abajo sobre porque ahora conecta directamente con la tabla 
	//que une las dos tablas y no con la otra tabla que forma la unión
	
//	@JoinTable(
//		name = "escribe",
//		/*
//		 * primero va la clase en la que estás
//		 */
//		joinColumns = @JoinColumn(name="idlibro"),
//		//luego la inverse column es la clase del mappedBy
//		inverseJoinColumns = @JoinColumn(name="idautor")
//	)
	
	
	
	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Set<Persona> getAutores() {
		return autores;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", ISBN=" + ISBN + ", titulo=" + titulo + ", autores=" + autores + "]";
	}

	
	
}
