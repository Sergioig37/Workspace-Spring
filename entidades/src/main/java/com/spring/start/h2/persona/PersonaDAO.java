package com.spring.start.h2.persona;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

	List<Persona> findByNombreAndEdadLessThanEqual( String nombre, int edad);
	
	
	 @Query(value = "SELECT * FROM PERSONA WHERE ID = ?1 AND NOMBRE= ?2", nativeQuery = true)
	//también sirve poniendo NOMBRE = :nombre
	 Persona findByIdAndNombre(Long ID, String nombre);
}
