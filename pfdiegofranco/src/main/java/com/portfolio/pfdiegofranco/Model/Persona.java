package com.portfolio.pfdiegofranco.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Persona {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 1, max=50, message = "Longitud no satisfecha")
    private String nombre;

    @NotNull
    @Size(min = 1, max=50, message = "Longitud no satisfecha")
    private String apellido;
}
