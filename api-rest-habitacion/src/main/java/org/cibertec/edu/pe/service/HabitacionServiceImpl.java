package org.cibertec.edu.pe.service;

import java.util.List;

import org.cibertec.edu.pe.dto.HabitacionDto;
import org.cibertec.edu.pe.model.Habitacion;
import org.cibertec.edu.pe.repository.HabitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabitacionServiceImpl implements HabitacionService{
	
	@Autowired
	private HabitacionRepository habitacionRepo;

	@Override
	public List<Habitacion> findAll() {
		return habitacionRepo.findAll();
	}

	@Override
	public Habitacion update(HabitacionDto habitacion) {
		Habitacion habiActualizada = habitacionRepo.findByNro(habitacion.getNro());
		
		if(habiActualizada != null) {
			habiActualizada.setEstado(habitacion.getEstado());
			return habitacionRepo.save(habiActualizada);
		}
		
		return null;
	}

	

}
