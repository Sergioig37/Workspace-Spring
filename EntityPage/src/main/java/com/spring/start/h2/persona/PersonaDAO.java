package com.spring.start.h2.persona;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

	List<Persona> findByNombreAndEdadLessThanEqual( String nombre, int edad);
	List<Persona> findByEdadLessThan(int edad, Pageable pageable);
	
	 @Query(value = "SELECT * FROM PERSONA WHERE ID = ?1 AND NOMBRE= ?2", nativeQuery = true)
	//también sirve poniendo NOMBRE = :nombre
	 Persona findByIdAndNombre(Long ID, String nombre);
}
