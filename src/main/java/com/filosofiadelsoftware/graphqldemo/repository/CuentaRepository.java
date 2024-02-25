package com.filosofiadelsoftware.graphqldemo.repository;

import com.filosofiadelsoftware.graphqldemo.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Integer> {

}
