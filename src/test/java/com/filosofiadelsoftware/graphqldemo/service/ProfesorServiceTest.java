package com.filosofiadelsoftware.graphqldemo.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import com.filosofiadelsoftware.graphqldemo.entity.Profesor;
import com.filosofiadelsoftware.graphqldemo.repository.ProfesorRepository;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic.Verification;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ProfesorServiceTest {

  @InjectMocks
  ProfesorService service;

  @Mock
  ProfesorRepository repository;

  @Test
  void sumar() {
    int resultado = service.sumar(2, 3);
    assertEquals(5, resultado);
  }

  // GIVEN WHEN THEN
  @Test
  void DadoOrlando_CuandoValideNombre_EntoncesReturnFalse() {
    /*
        Arrange : Preparar la data, La estoy enviando al metodo
        Act: Ejecutar el metodo
        Assert: Validaciones que necesita,
     */
    Profesor profe = new Profesor();
    profe.setNombre("Orlando");
    boolean resultado = service.validarNombrePermitido(profe);
    assertFalse(resultado);
    // Prohibido: LOGICA NEGATIVA
    // NOMBRES QUE NO SEAN DICIENTES
    // Pruebas sin asserts o verify segun corresponda
  }

  @Test
  void DadoDaniel_CuandoValideNombre_EntoncesReturntrue() {
    Profesor profe = new Profesor();
    profe.setNombre("Daniel");
    boolean resultado = service.validarNombrePermitido(profe);
    assertTrue(resultado);
  }

  @Test
  void DadoProfesorInformatica_CuandoCalculeSalario_EntoncesRetorna100() {
    Profesor profesor = new Profesor();
    profesor.setEdad(33);
    profesor.setCarrera("Informatica");

    int salario = service.calcularSalario(profesor);
    assertEquals(100, salario);
    verify(repository).delete(profesor);
  }

  @Test
  void consultarProfesor() {
    Profesor profesor = new Profesor();
    profesor.setCarrera("Informatica");
    when(repository.findById(5)).thenReturn(Optional.of(profesor));

    Boolean result = service.validarCarrera(5);
    assertTrue(result);

  }
}