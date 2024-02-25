package com.filosofiadelsoftware.graphqldemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.Data;

@Entity
@Table(name = "Transacciones")
@Data
public class Transaccion {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "transaccion_id")
  private int transaccionId;

  @ManyToOne
  @JoinColumn(name = "cuenta_origen")
  private Cuenta cuentaOrigen;

  @ManyToOne
  @JoinColumn(name = "cuenta_destino")
  private Cuenta cuentaDestino;

  private Integer monto;

  @Column(name = "tipo_transaccion")
  private String tipoTransaccion;

  private LocalDateTime fecha;

}