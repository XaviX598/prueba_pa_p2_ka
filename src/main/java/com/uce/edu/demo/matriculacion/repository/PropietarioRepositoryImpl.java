package com.uce.edu.demo.matriculacion.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.matriculacion.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado el propietario: "+p);
	}

	@Override
	public void eliminar(Integer cedula) {
		// TODO Auto-generated method stub
		System.out.println("Eliminacion exitosa del propietario con cedula:" + cedula);
	}
	
	

}
