package com.spring.start.web;

public class Libro {
	
	private String isbn;
	private String nombreAutor;
	private String fechaPublicacion;
	private String categoria;
	
	
	
	public Libro(String isbn, String nombreAutor, String fecha, String categoria) {
		
		this.isbn = isbn;
		this.nombreAutor = nombreAutor;
		this.fechaPublicacion = fecha;
		this.categoria = categoria;
		
	}



	@Override
	public String toString() {
		return "Libro [isbn= " + isbn + ", nombreAutor= " + nombreAutor + ", fechaPublicacion= " + fechaPublicacion
				+ ", categoria= " + categoria + "]";
	}
	
	
	
	
}
