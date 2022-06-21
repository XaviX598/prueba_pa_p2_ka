package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

public interface IVehiculoService {
	
	public void ingresar(Vehiculo v);
	
	public Vehiculo buscar(String placa);
	
	public void actualizar(Vehiculo v);
	
	public void eliminar(String placa);
	
	public BigDecimal calcularMatricula(BigDecimal precio);

}
