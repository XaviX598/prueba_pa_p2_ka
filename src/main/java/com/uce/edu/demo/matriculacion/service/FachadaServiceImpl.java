package com.uce.edu.demo.matriculacion.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.matriculacion.modelo.Vehiculo;
import com.uce.edu.demo.matriculacion.repository.IVehiculoRepository;

@Service
public class FachadaServiceImpl implements IFachadaService{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	
	@Autowired
	@Qualifier("pesado")
	private IVehiculoService iVehiculoServiceP;
	@Autowired
	@Qualifier("liviano")
	private IVehiculoService iVehiculoServiceL;
	
	@Override
	public BigDecimal calcularMatricula(String placa) {
		// TODO Auto-generated method stub
		BigDecimal calcularMat= null;
		Vehiculo veh = this.iVehiculoRepository.buscar(placa);
		if (veh.getTipo().equals("P")) {
			calcularMat= this.iVehiculoServiceP.calcularMatricula(calcularMat);
			if(calcularMat.equals(new BigDecimal(2000))) {
				calcularMat= calcularMat.multiply(new BigDecimal(0.93));
			}
		} else {
			calcularMat= this.iVehiculoServiceL.calcularMatricula(calcularMat);
			if(calcularMat.equals(new BigDecimal(2000))) {
				calcularMat= calcularMat.multiply(new BigDecimal(0.93));
			}
		}
		
		return calcularMat;
	}

}
