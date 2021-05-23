package edu.usal.negocio.dominio;

public class Alumno {
	
	private Integer codigo;
	private String nombre;
	private String apellido;
	private String dni;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	public Alumno(Integer codigo, String nombre, String apellido, String dni) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
		
}
