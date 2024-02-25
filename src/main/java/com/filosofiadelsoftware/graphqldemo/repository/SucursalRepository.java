package com.filosofiadelsoftware.graphqldemo.repository;

import com.filosofiadelsoftware.graphqldemo.entity.Sucursal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

}
