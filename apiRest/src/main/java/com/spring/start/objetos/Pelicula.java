package com.spring.start.objetos;

public class Pelicula {

	private int id;
	private String titulo;
	private String genero;
	private String director;
	
	
	public Pelicula(int id, String titulo, String genero, String director) {
		this.id = id;
		this.director = director;
		this.titulo = titulo;
		this.genero = genero;
	}
	
	
	
	
	@Override
	public String toString() {
		return id+"" + titulo + " genero: " + genero + " director: " + director + "";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
}
