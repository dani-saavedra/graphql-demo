package com.filosofiadelsoftware.graphqldemo.controller;

import com.filosofiadelsoftware.graphqldemo.entity.Cliente;
import com.filosofiadelsoftware.graphqldemo.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class QueryController {

  private final ClienteRepository clienteRepository;


  @QueryMapping
  public Cliente cliente(@Argument Integer clienteId) {
    return clienteRepository.findById(clienteId).orElse(null);
  }
}
