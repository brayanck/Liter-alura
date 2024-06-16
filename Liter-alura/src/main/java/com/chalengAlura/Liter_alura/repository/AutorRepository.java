package com.chalengAlura.Liter_alura.repository;

import com.chalengAlura.Liter_alura.model.Autor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Autor> findByNombre(String nombre);

    @Query("SELECT a FROM Autor a WHERE a.fecha_nacimiento <= :anio AND a.fecha_deceso >= :anio")
    List<Autor> listaAutoresVivosPorAnio(Integer anio);
}
