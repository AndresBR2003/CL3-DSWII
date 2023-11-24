package org.cibertec.edu.pe.restController;

import java.util.List;

import org.cibertec.edu.pe.dto.Request;
import org.cibertec.edu.pe.dto.ReservacionRequest;
import org.cibertec.edu.pe.dto.ResponseDTO;
import org.cibertec.edu.pe.entities.Habitacion;
import org.cibertec.edu.pe.entities.Reservacion;
import org.cibertec.edu.pe.restService.HabitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/reservacion")
@RestController
public class restController {
	

	
	@Autowired
	private HabitacionService habitaService;
	
	
	@PutMapping("/generarReserva")
	public ResponseDTO generarReservacion(@RequestBody Request dto) {
		
		Habitacion habiDto = new Habitacion();
		habiDto.setNro(dto.getReservacion().getHabitacion().getNro());
		habiDto.setEstado(dto.getReservacion().getHabitacion().getEstado());
		habitaService.actualizarEstadoHabitacion(habiDto);
		
		
		ReservacionRequest reserDto = new ReservacionRequest();
		reserDto.setFecha(dto.getReservacion().getFecha());
		reserDto.setNro(dto.getReservacion().getHabitacion().getNro());
		reserDto.setCosto(dto.getReservacion().getCosto());
		habitaService.guardar(reserDto);
		
		ResponseDTO responseDto = new ResponseDTO();
		responseDto.setEstado("EN PROCESO");
		responseDto.setDetalles(dto.getReservacion());
		
		return responseDto;
	}
	
	@GetMapping("/listadoHabitaciones")
	public List<Habitacion> getListHabitaciones(){
		return this.habitaService.getHabitaciones();
	}

}
