package com.filosofiadelsoftware.graphqldemo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Sucursales")
@Data
public class Sucursal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sucursal_id")
  private int sucursalId;

  @Column(name = "nombre_sucursal")
  private String nombreSucursal;

  private String direccion;
  private String telefono;
  private String ciudad;
}
