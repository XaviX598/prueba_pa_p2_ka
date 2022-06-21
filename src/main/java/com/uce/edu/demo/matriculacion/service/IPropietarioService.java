package com.uce.edu.demo.matriculacion.service;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

public interface IPropietarioService {

	public void crear(Propietario p);

	public void eliminar(Integer cedula);

}
