package com.filosofiadelsoftware.graphqldemo.service;

import com.filosofiadelsoftware.graphqldemo.entity.Profesor;
import com.filosofiadelsoftware.graphqldemo.repository.ProfesorRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ProfesorService {

  private final ProfesorRepository repository;

  public ProfesorService(ProfesorRepository repository) {
    this.repository = repository;
  }

  //Los profesores de Informatica deben ser mayor a 25
//Los medicina mayores a 30
//Cualquier otro solo debe ser mayor de edad(18)
  public String guardarProfesor(Profesor profesor) {
    //Evaluar constante contra variables, no variables contra constantes.
    if ("Informatica".equals(profesor.getCarrera()) && profesor.getEdad() < 25) {
      throw new IllegalArgumentException("Profesor no cumple con requisitos de la carrera");
    }
    repository.save(profesor);
    return "Profesor Guardado";
  }

  public Profesor obtenerProfesor(Integer id) {
    return repository.findById(id).orElse(null);
  }

  public List<Profesor> obtenerProfesores() {
    return repository.findAll();
  }
}
