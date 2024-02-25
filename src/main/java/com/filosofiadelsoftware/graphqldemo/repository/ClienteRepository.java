package com.filosofiadelsoftware.graphqldemo.repository;

import com.filosofiadelsoftware.graphqldemo.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
