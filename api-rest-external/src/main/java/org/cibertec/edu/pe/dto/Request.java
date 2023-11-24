package org.cibertec.edu.pe.dto;

import org.cibertec.edu.pe.entities.Reservacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

	Reservacion reservacion;
	
}
