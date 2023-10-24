package com.spring.start.objetos;

import java.util.ArrayList;
import java.util.List;

public class Cine {

	private int id;
	private String nombre;
	private int capacidad;
	private Direccion direccion;
	ArrayList<Pelicula> peliculas;

	
	
	
	public Cine(int id, String nombre, int capacidad) {
		
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
		this.direccion = null;
		this.peliculas = null;
	}
	
	public Cine() {
		super();
		this.id = 0;
		this.nombre = null;
		this.capacidad = 0;
		this.peliculas = new ArrayList<Pelicula>();
	}
	
	public Pelicula getPelicula(int id) {
		
		boolean encontrada = false;
		int i=0;
		int posicion = 0;
		while(encontrada==false&&i!=peliculas.size()) {
			if(peliculas.get(i).getId()==id) {
				encontrada = true;
				posicion = i;
			}
			i++;
		}
		
		
		if(encontrada==true) {
			return peliculas.get(posicion);
		}
		else {
				return null;
		}
	
		
	}
	public void addPelicula(Pelicula pelicula) {
		peliculas.add(pelicula);	
	}
	
	
	public boolean deletePelicula(int id) {
		
		
		boolean borrado = false;
		int i=0;
		while(borrado==false&&i!=peliculas.size()) {
			if (peliculas.get(i).getId() == id) {
				peliculas.remove(i);
				borrado = true;
			}
			i++;
		}
		
		return borrado;
		
	}
	
	public boolean updatePelicula(int id, Pelicula pelicula) {
		
		boolean actualizado = false;
		int i=0;
		while(actualizado==false&&i!=peliculas.size()) {
			if(peliculas.get(i).getId()==id) {
				pelicula.setId(peliculas.get(i).getId());
				peliculas.set(i, pelicula); 
				actualizado = true;
			}
			i++;
		}
		
		return actualizado;
		
	}

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
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	
	
	
}
