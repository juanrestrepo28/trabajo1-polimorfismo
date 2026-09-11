package com.example.polimorfismo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal de la aplicación.
 * IMPORTANTE: el main() NO contiene lógica de negocio ni procedimientos propios,
 * solo arranca el contenedor de Spring Boot. Toda la lógica está en los paquetes
 * "modelo" y "controlador", tal como lo pide el enunciado.
 */
@SpringBootApplication
public class PolimorfismoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PolimorfismoApplication.class, args);
    }
}
