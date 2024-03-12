package com.filosofiadelsoftware.graphqldemo.integration;

import com.filosofiadelsoftware.graphqldemo.entity.Profesor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class ProfesorControllerTest extends AbstractTest {


  String path = "/profesor";
  //RestTemplate se invocan servicios http
  //Request en python

  //PARA INYECTAR UNA DEPENDENCIA A LA FUERZA
  @Autowired// SOLO ESTA PERMITIDO EN LOS TEST
      TestRestTemplate restTemplate;

  @Test
  void test_ajustarNombre() {
    Profesor profesor = new Profesor();
    profesor.setId(123);
    profesor.setNombre("Dani");
    ResponseEntity<String> response = restTemplate.postForEntity(path, profesor,
        String.class);

    Assertions.assertEquals("Profesor Guardado", response.getBody());
  }

  @Test
  void opcion1Llamada_fuerza() {
    Profesor profesor = new Profesor();
    profesor.setId(123);
    profesor.setNombre("Dani");
    ResponseEntity<String> response = restTemplate.postForEntity(path, profesor,
        String.class);

    ResponseEntity<Profesor> result = restTemplate.getForEntity(path + "/123", Profesor.class);

    Assertions.assertEquals("Dani", result.getBody().getNombre());
  }

}
