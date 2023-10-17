package com.spring.start.objetos;

public class Direccion {

	private String ciudad;
	private String calle;
	private String cp;
	
	
	
	@Override
	public String toString() {
		return "[" + ciudad + "|" + calle + "|" + cp + "]";
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	
}
