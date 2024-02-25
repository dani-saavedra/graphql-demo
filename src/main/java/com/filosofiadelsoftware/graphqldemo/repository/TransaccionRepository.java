package com.filosofiadelsoftware.graphqldemo.repository;

import com.filosofiadelsoftware.graphqldemo.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion, Integer> {

}
