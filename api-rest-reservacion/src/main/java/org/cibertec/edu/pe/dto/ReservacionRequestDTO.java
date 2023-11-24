package org.cibertec.edu.pe.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservacionRequestDTO {

	private String fecha;
	private int nro;
	private double costo; 
}
