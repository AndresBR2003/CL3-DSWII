package org.cibertec.edu.pe.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reservacion {
	
	private String fecha;
	private Habitacion habitacion;
	private double costo; 
	
}
