/**
 * 
 */
package edu.usal.negocio.dominio;

/**
 * @author Usalmove
 *
 */
public class Pabellon {

	private Integer idPabellon;
	private Integer tamano;
	private String direccion;
	private String nombre;
	
	/**
	 * 
	 */
	public Pabellon() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idPabellon
	 * @param tamano
	 * @param direccion
	 * @param nombre
	 */
	public Pabellon(Integer idPabellon, Integer tamano, String direccion, String nombre) {
		this.idPabellon = idPabellon;
		this.tamano = tamano;
		this.direccion = direccion;
		this.nombre = nombre;
	}

	/**
	 * @return the idPabellon
	 */
	public Integer getIdPabellon() {
		return idPabellon;
	}

	/**
	 * @param idPabellon the idPabellon to set
	 */
	public void setIdPabellon(Integer idPabellon) {
		this.idPabellon = idPabellon;
	}

	/**
	 * @return the tamano
	 */
	public Integer getTamano() {
		return tamano;
	}

	/**
	 * @param tamano the tamano to set
	 */
	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
