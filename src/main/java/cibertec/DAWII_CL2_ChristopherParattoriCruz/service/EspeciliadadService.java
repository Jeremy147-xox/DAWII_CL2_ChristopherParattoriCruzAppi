package cibertec.DAWII_CL2_ChristopherParattoriCruz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.DAWII_CL2_ChristopherParattoriCruz.model.Especialidad;
import cibertec.DAWII_CL2_ChristopherParattoriCruz.repository.EspecialidadRepository;

@Service
public class EspeciliadadService {

	@Autowired
    private EspecialidadRepository especialidadRepository;
	
  
    public Especialidad guardarEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }

   
    public void eliminarEspecialidad(String idEspecialidad) {
        especialidadRepository.deleteById(idEspecialidad);
    }

 
    public Especialidad obtenerEspecialidad(String idEspecialidad) {
        return especialidadRepository.findById(idEspecialidad).orElse(null);
    }

  
    public List<Especialidad> obtenerTodasLasEspecialidades() {
        return (List<Especialidad>) especialidadRepository.findAll();
    }

  
    public Especialidad actualizarEspecialidad(Especialidad especialidad) {
        return especialidadRepository.save(especialidad);
    }
	
}
