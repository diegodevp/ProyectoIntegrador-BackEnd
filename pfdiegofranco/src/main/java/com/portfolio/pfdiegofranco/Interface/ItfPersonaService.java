package com.portfolio.pfdiegofranco.Interface;

import com.portfolio.pfdiegofranco.Model.Persona;

import java.util.List;

public interface ItfPersonaService {
    //GET list
    public List<Persona> getPersona();

    //SAVE persona
    public void savePersona(Persona persona);

    //DELETE by ID
    public void deletePersona(Long id);

    //FIND by ID
    public Persona findPersona(Long id);
}
