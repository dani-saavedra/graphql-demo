package com.filosofiadelsoftware.graphqldemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.Date;
import lombok.Data;


@Entity
@Table(name = "Cuentas")
@Data
public class Cuenta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cuenta_id")
  private int cuentaId;

  @Column(name = "cliente_id")
  private Integer clienteId;

  @Column(name = "tipo_cuenta")
  private String tipoCuenta;

  private Integer saldo;

  @Column(name = "fecha_apertura")
  private LocalDate fechaApertura;


}
