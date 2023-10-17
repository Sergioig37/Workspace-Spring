package com.spring.start.objetos;

public class Cine {

	private int id;
	private String nombre;
	private int capacidad;
	private Direccion direccion;

	
	@Override
	public String toString() {
		return "[" + id + "]" + nombre + "|" + direccion + "|" + capacidad;
	}


	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
	
	
	
	
}
