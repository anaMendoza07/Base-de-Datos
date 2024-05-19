package org.example.model;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Sucursal {

    private int codigo;
    private String nombre;

    private String ubicacion;
    private Empleado director;

    private int presupuestoAnual;
}