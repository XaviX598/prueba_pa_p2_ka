package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;

@Service
@Qualifier("pesado")
public class VehiculoPesadoServiceImpl implements IVehiculoService{

	@Override
	public void ingresar(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularMatricula(BigDecimal precio) {
		// TODO Auto-generated method stub
		BigDecimal valorMatri = precio.multiply(new BigDecimal(0.15));
		return valorMatri;
	}

}
