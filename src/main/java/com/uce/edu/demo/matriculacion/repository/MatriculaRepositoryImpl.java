package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository{

	@Override
	public void crear(Integer cedula, String placa) {
		// TODO Auto-generated method stub
		System.out.println("Matricula del automovil del señor con cedula "+cedula+" cuya placa es "+placa);
	}

}
