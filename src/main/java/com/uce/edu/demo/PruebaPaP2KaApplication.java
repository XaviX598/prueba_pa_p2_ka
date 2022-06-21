package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.matriculacion.modelo.Matricula;
import com.uce.edu.demo.matriculacion.modelo.Propietario;
import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.service.IFachadaService;




@SpringBootApplication
public class PruebaPaP2KaApplication {
	
	@Autowired
	public IFachadaService iFachadaService;
	

	
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(PruebaPaP2KaApplication.class, args);
		
		
		//1. Crea un vehjculo
		System.out.println("El vehiculo creado es: \n");
		Vehiculo v1= new Vehiculo();
		v1.setMarca("Kia");
		v1.setPlaca("dsa 1548");
		v1.setPrecio(new BigDecimal(25000));
		v1.setTipo("L");
		
		System.out.println(v1);
		System.out.println();
		//2. actualiza el vehiculo anterior
		System.out.println("EL vehiculo acuatilizado es: \n");
		v1.setMarca("Hyundai");
		v1.setPrecio(new BigDecimal(30000));
		System.out.println(v1);
		System.out.println();
		
		//3.crea un propietario
		System.out.println("EL propietario creado es: \n");
		Propietario p1 = new Propietario();
		p1.setNombre("Xavier");
		p1.setApellido("Aguilar");
		p1.setCedula(541561584);
		p1.setFechaNacimiento(LocalDateTime.of(1998, 5, 3, 12, 0));
		System.out.println(p1);
		System.out.println();
		
		//4. realizar una matricula a partir de los dato cedula y placa 
		Matricula m1 = new Matricula();
		m1.setVehiculo(v1);
		m1.setPropietario(p1);
		m1.setFechaMatricula(LocalDateTime.now());
		
		m1.setValorMAtricula(new BigDecimal(2));
		System.out.println(m1);
		
		
	}

}
