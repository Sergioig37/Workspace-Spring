package com.spring.start.h2.escribe;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class EscribeKey implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Column
	private Long idLibro;
	@Column
	private Long idAutor;
	
	
	
	
	public Long getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(Long idLibro) {
		this.idLibro = idLibro;
	}
	public Long getIdAutor() {
		return idAutor;
	}
	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}
	
	/*
	 * Esto va a hacer las mates
	 * para crear un id único
	 */
	@Override
	public int hashCode() {
		return Objects.hash(idAutor, idLibro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EscribeKey other = (EscribeKey) obj;
		return Objects.equals(idAutor, other.idAutor) && Objects.equals(idLibro, other.idLibro);
	}
	
}
