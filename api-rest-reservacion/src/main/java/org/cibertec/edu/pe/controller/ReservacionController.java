package org.cibertec.edu.pe.controller;


import org.cibertec.edu.pe.dto.ReservacionRequestDTO;
import org.cibertec.edu.pe.service.ReservacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/reservacion")
public class ReservacionController {

	@Autowired
	private ReservacionService reserService;
	
	@PutMapping("/guardar")
	public ReservacionRequestDTO guardar(@RequestBody ReservacionRequestDTO reservacion) {
		reserService.save(reservacion);
		return reservacion;
	}
}
