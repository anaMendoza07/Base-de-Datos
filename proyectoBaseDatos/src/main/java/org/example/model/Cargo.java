package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Cargo {
    private String cargo;
    private int salario;
    private String nombre;
    private String funcionesAsignadas;
}
