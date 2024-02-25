package com.filosofiadelsoftware.graphqldemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "Clientes")
@Data
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "cliente_id")
  private int clienteId;

  private String nombre;
  private String apellido;
  private String direccion;

  @Column(name = "correo_electronico")
  private String correoElectronico;

  private String telefono;

  @OneToMany(mappedBy = "clienteId")
  private List<Cuenta> cuentas;
}
