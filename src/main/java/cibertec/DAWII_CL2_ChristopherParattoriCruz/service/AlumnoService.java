package cibertec.DAWII_CL2_ChristopherParattoriCruz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.DAWII_CL2_ChristopherParattoriCruz.model.Alumno;
import cibertec.DAWII_CL2_ChristopherParattoriCruz.repository.AlumnoRepository;

@Service
public class AlumnoService {

	@Autowired
    private AlumnoRepository alumnoRepository;


    public Alumno guardarAlumno(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

   
    public void eliminarAlumno(String idAlumno) {
        alumnoRepository.deleteById(idAlumno);
    }

  
    public Alumno obtenerAlumno(String idAlumno) {
        return alumnoRepository.findById(idAlumno).orElse(null);
    }

 
    public List<Alumno> obtenerTodosLosAlumnos() {
        return (List<Alumno>) alumnoRepository.findAll();
    }
    
    public Alumno actualizarAlumno(String idAlumno, Alumno alumnoModificado) {

        Alumno alumnoExistente = obtenerAlumno(idAlumno);
        if (alumnoExistente != null) {
            alumnoModificado.setId(idAlumno);
            return alumnoRepository.save(alumnoModificado);
        }
        return null;
    }
    
    
	
}
