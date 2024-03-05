package com.filosofiadelsoftware.graphqldemo.controller;

import com.filosofiadelsoftware.graphqldemo.repository.ProfesorRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjemploController {

  List<Estudiante> estudiantes = new ArrayList<>();
  private ProfesorRepository profesorRepository;

  public EjemploController(ProfesorRepository profesorRepository) {
    estudiantes.add(new Estudiante(11, "Camilo", "Tarazona", 5, "Masculino"));
    estudiantes.add(new Estudiante(22, "Juan", "Montes", 6, "Masculino"));
    estudiantes.add(new Estudiante(33, "Sara", "Parra", 6, "Femenino"));
    estudiantes.add(new Estudiante(44, "Sebastian", "Castellanos", 6, "Masculino"));
    estudiantes.add(new Estudiante(44, "Mariana", "Chacon", 6, "Femenino"));
  }

  @GetMapping("/saludo")
  public String saludar() {
    return "Hola Clase";
  }

  // @GetMapping("/estudiantes")
  //public List<Estudiante> obtenerEstudiante() {
  // return estudiantes;
  //}

  @GetMapping("/estudiantes/todos")
  public List<Estudiante> obtenerTodos() {
    return estudiantes;
  }

  @GetMapping("/estudiantes")
  public List<Estudiante> obtenerEstudiantePorSemestre(@RequestParam int semestre,
      @RequestParam String sexo) {
    List<Estudiante> resultado = new ArrayList<>();
    for (Estudiante estudiante : estudiantes) {
      if (estudiante.semestre() == semestre && estudiante.sexo().equals(sexo)) {
        resultado.add(estudiante);
      }
    }
    return resultado;
  }

  @GetMapping("/estudiantes/{id}")
  public Response<Estudiante> obtenerEstudiantePorId(@PathVariable int id) {
    for (Estudiante estudiante : estudiantes) {
      if (estudiante.documento() == id) {
        return new Response<>(estudiante);
      }
    }
    return new Response<>("Estudiante no encontrado");
  }


  // Path Variable: Cierto recurso en especifico, hace parte de la ruta a solicitar
  // Query Param: Filtrar, consultas, paginacion

  //Paginacion ficticia: El back retorna todos los resultados y es el front quien los pagina

  //Paginacion Real: el front va pidiendo dependiendo de la pagina los datos necesita
}
