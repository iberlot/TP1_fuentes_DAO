/**
 * 
 */
package edu.usal.negocio.dominio;

/**
 * @author Usalmove
 *
 */
public abstract class Empleados {

	/**
	 * Identificador de la persona
	 */
	protected long dni;
	protected String nombre;
	protected String apellido;
	protected String direccion;
	protected double sueldo;

	public Empleados() {
	};

	public Empleados( String nombre, String apellido, long dni, String direccion, double sueldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.sueldo = sueldo;
	}


	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	protected String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	protected void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the dni
	 */
	protected long getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	protected void setDni(long dni) {
		this.dni = dni;
	}

	/**
	 * @return the direccion
	 */
	protected String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	protected void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the sueldo
	 */
	protected double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo the sueldo to set
	 */
	protected void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
