package com.filosofiadelsoftware.graphqldemo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Empleados")
@Data
public class Empleado {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "empleado_id")
  private int empleadoId;

  private String nombre;
  private String apellido;
  private String cargo;

  @ManyToOne
  @JoinColumn(name = "sucursal_id")
  private Sucursal sucursal;
}
