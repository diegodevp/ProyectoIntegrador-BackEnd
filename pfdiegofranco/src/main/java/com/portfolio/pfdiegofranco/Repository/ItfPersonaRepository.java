package com.portfolio.pfdiegofranco.Repository;

import com.portfolio.pfdiegofranco.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ItfPersonaRepository extends JpaRepository<Persona, Long> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
