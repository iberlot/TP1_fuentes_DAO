package edu.usal.negocio.dominio;

import java.util.ArrayList;

public class Alumno {
	
//	private Integer codigo;
	private String nombre;
	private String apellido;
	private long dni;
	
	private ArrayList<Carrera> carreras;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(String nombre, String apellido, long dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * @return the carreras
	 */
	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}

	/**
	 * @param carreras the carreras to set
	 */
	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}
	
	
		
}
