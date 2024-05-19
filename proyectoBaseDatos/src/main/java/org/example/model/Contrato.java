package org.example.model;



import java.io.Serializable;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode



public class Contrato implements Serializable {

    private int fechaInicio;
    private int fechaFin;
    private Sucursal sucursal;
    private Empleado empleado;
    private Cargo cargo;
}
