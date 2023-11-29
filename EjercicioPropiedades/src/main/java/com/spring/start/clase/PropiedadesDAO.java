package com.spring.start.clase;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface PropiedadesDAO extends CrudRepository<Propiedades, Long> {

    List<Propiedades> findByPrecioBetween(int precioMin, int precioMax);

    List<Propiedades> findByLocalizacionEndingWith(String caracter);

    List<Propiedades> findByPrecioBetweenOrderByPrecioAsc(int precioMin, int precioMax);
    
    List<Propiedades> findByPrecioNotIn(List<Integer> precio);
    
    List<Propiedades> findByLocalizacionIgnoreCase(String nombre);
}
