package com.uce.edu.demo.matriculacion.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Matricula {

	private LocalDateTime fechaMatricula;
	private BigDecimal valorMAtricula;
	private Propietario propietario;
	private Vehiculo vehiculo;

	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMAtricula=" + valorMAtricula + ", propietario="
				+ propietario + ", vehiculo=" + vehiculo + "]";
	}

	// set y get
	public LocalDateTime getFechaMatricula() {
		return fechaMatricula;
	}

	public void setFechaMatricula(LocalDateTime fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}

	public BigDecimal getValorMAtricula() {
		return valorMAtricula;
	}

	public void setValorMAtricula(BigDecimal valorMAtricula) {
		this.valorMAtricula = valorMAtricula;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
