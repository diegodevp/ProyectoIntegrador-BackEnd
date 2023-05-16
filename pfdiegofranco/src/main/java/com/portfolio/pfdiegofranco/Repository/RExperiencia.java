package com.portfolio.pfdiegofranco.Repository;

import com.portfolio.pfdiegofranco.Model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer>{
    public Optional<Experiencia> findByNombreE (String nombreE);
    public boolean existsByNombre (String nombreE);
}
