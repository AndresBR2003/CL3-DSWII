package org.cibertec.edu.pe.repository;

import org.cibertec.edu.pe.model.Habitacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



@Repository
public interface HabitacionRepository extends JpaRepository<Habitacion, Integer>{

	@Query("SELECT h FROM Habitacion h WHERE h.nro = ?1")
	Habitacion findByNro(int nro);
	
}
