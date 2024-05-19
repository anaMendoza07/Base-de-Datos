package org.example.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Empleado {

    private int id;
    private String cedula;
    private String nombre;
    private String telefono;
    private String direccion;
    private Cargo cargo;
    private String profesion;
}