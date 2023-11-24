package org.cibertec.edu.pe.service;

import org.cibertec.edu.pe.dto.ReservacionRequestDTO;
import org.cibertec.edu.pe.models.Reservacion;
import org.springframework.stereotype.Service;


public interface ReservacionService {

	public Reservacion save(ReservacionRequestDTO reservacion);
}
