package com.spring.start.web;

public class Animal {

	private int id;
	private String nombre;
	private String raza;
	private String fechaUltimaVacuna;
	private String localidadResidencia;
	
	public Animal(int id,String nombre,String raza,String fechaUltimaVacuna,String localidadResidencia) {
		
		this.id = id;
		this.nombre = nombre;
		this.fechaUltimaVacuna = fechaUltimaVacuna;
		this.localidadResidencia = localidadResidencia;
		this.raza = raza;
		
	}

	@Override
	public String toString() {
		return "Animal [id=" + id  +"\n"+" Nombre= " + nombre +"\n" + " raza= " + raza +"\n"+  "Última vacuna= " + fechaUltimaVacuna
				+"\n"+ "Localidad= " + localidadResidencia + "]";
	}
	
	
}
