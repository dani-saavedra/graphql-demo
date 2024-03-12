package com.filosofiadelsoftware.graphqldemo.service;

import com.filosofiadelsoftware.graphqldemo.entity.Profesor;
import com.filosofiadelsoftware.graphqldemo.repository.ProfesorRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProfesorService {

  ProfesorRepository repository;

  public ProfesorService(ProfesorRepository repository) {
    this.repository = repository;
  }

  public int sumar(int x, int y) {
    return x + y;
  }

  public boolean validarNombrePermitido(Profesor profesor) {
    if ("Orlando".equals(profesor.getNombre())) {
      return false;
    }
    return true;
  }

  public int calcularSalario(Profesor profesor) {
    if (profesor.getEdad() >= 33 && "Informatica".equals(profesor.getCarrera())) {
      repository.delete(profesor);
      return 100;
    }
    if (profesor.getEdad() >= 30) {
      return 50;
    } else {
      return 20;
    }
  }

  public Boolean validarCarrera(int id) {
    Optional<Profesor> opt = repository.findById(id);
    return opt.isPresent() && (opt.get().getCarrera().equals("Informatica"));
  }

  public int calcularBonoAnual(Profesor profesor) {
    if ("Informatica".equals(profesor.getCarrera())) {
      return 20;
    } else if ("Medicina".equals(profesor.getCarrera())) {
      return 10;
    } else {
      return 5;
    }
  }
}
