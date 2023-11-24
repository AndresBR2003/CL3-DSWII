package org.cibertec.edu.pe.service;

import java.util.List;

import org.cibertec.edu.pe.dto.HabitacionDto;
import org.cibertec.edu.pe.model.Habitacion;

public interface HabitacionService {

	 public List<Habitacion> findAll();
	 
	 public Habitacion update(HabitacionDto Nro);
	 
}
