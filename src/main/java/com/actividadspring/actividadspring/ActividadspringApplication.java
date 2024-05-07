package com.actividadspring.actividadspring;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.actividadspring.actividadspring.controllers.ObtenerNombreAprendiz;


@RestController
@SpringBootApplication
public class ActividadspringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActividadspringApplication.class, args);
    }

    @GetMapping("/aprendiz")
    public String obtenerNombreAprendiz(@RequestParam(name = "nombre", defaultValue = "alberto") String nombre) {
        ObtenerNombreAprendiz aprendiz = new ObtenerNombreAprendiz(LocalDateTime.now(), "Alberto", "Ibarra", 25);
        return "Nombre: " + aprendiz.getNombreAprendiz() + ", Apellido: " + aprendiz.getApellidoAprendiz() + ", Edad: " + aprendiz.getEdadAprendiz();
	}
	
	
}
