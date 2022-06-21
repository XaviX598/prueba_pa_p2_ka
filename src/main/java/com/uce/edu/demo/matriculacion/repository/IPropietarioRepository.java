package com.uce.edu.demo.matriculacion.repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioRepository {
	
	public void crear(Propietario p);
	
	public void eliminar(Integer cedula);

}
