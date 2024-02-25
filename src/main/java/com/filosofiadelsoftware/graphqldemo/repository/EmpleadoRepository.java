package com.filosofiadelsoftware.graphqldemo.repository;

import com.filosofiadelsoftware.graphqldemo.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
