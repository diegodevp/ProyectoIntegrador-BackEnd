package com.portfolio.pfdiegofranco.Service;

import com.portfolio.pfdiegofranco.Model.Persona;
import com.portfolio.pfdiegofranco.Repository.ItfPersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImpPersonaService {

    @Autowired
    ItfPersonaRepository itfPersonaRepository;

    public List<Persona> list() {
        return itfPersonaRepository.findAll();
    }

    public Optional<Persona> getOne(Long id) {
        return itfPersonaRepository.findById(id);
    }

    public Optional<Persona> getByNombre(String nombre) {
        return itfPersonaRepository.findByNombre(nombre);
    }

    public void save(Persona persona) {
        itfPersonaRepository.save(persona);
    }

    public void delete(Long id) {
        itfPersonaRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return itfPersonaRepository.existsById(id);
    }

    public boolean existsByNombre(String nombre) {
        return itfPersonaRepository.existsByNombre(nombre);
    }
}
