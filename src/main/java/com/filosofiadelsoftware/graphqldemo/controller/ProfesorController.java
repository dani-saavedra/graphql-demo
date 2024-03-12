package com.filosofiadelsoftware.graphqldemo.controller;

import com.filosofiadelsoftware.graphqldemo.entity.Profesor;
import com.filosofiadelsoftware.graphqldemo.repository.ProfesorRepository;
import com.filosofiadelsoftware.graphqldemo.service.ProfesorService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfesorController {

  private final ProfesorRepository repository;

  public ProfesorController(ProfesorRepository repository) {
    this.repository = repository;
  }

  @PostMapping("/profesor")
  public String guardarProfesor(@RequestBody Profesor profesor) {
    repository.save(profesor);
    return "Profesor Guardado";
  }

  @GetMapping("/profesor/{id}")
  public Profesor obtenerProfesor(@PathVariable Integer id) {
    return repository.findById(id).orElse(null);
  }

}

