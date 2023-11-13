package com.spring.start.h2.alumnos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.spring.start.h2.proyectos.Proyectos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Alumnado {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@OneToMany(mappedBy="alumnado", fetch=FetchType.EAGER)
	@Fetch(value=FetchMode.SUBSELECT)
	private List<Proyectos> proyectos = new ArrayList<Proyectos>();
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Alumnado [dni=" + id + ", nombre=" + nombre + ", proyectos=" + proyectos + "]";
	}
	
	

	
	
	
	
}
