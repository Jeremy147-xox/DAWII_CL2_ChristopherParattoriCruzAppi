package cibertec.DAWII_CL2_ChristopherParattoriCruz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import cibertec.DAWII_CL2_ChristopherParattoriCruz.model.Alumno;
import cibertec.DAWII_CL2_ChristopherParattoriCruz.service.AlumnoService;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {
	
	@Autowired
    private  AlumnoService alumnoService;

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno guardarAlumno(@RequestBody Alumno alumno) {
        return alumnoService.guardarAlumno(alumno);
    }

    @GetMapping("/buscar/{id}")
    public Alumno obtenerAlumno(@PathVariable("id") String idAlumno) {
    	return alumnoService.obtenerAlumno(idAlumno);
    }

    @GetMapping("/listar")
    public List<Alumno> obtenerTodosLosAlumnos() {
        return  alumnoService.obtenerTodosLosAlumnos();
    }

    @PutMapping("/actualizar/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Alumno actualizarAlumno(@PathVariable("id") String idAlumno, @RequestBody Alumno alumnoModificado) {
    	return alumnoService.actualizarAlumno(idAlumno, alumnoModificado);

    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> eliminarAlumno(@PathVariable("id") String idAlumno) {
        alumnoService.eliminarAlumno(idAlumno);
        return ResponseEntity.noContent().build();
    }
}
