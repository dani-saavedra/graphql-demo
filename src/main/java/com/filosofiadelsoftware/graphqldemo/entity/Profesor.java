package com.filosofiadelsoftware.graphqldemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Table
@Entity
@Data
public class Profesor {

  @Id
  @Column
  private Integer id;

  @Column
  private String nombre;

  @Column
  private String carrera;

  @Column
  private Integer edad;

  @Column
  private String ciudadResidencia;
}

