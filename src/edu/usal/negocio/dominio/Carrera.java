/**
 * 
 */
package edu.usal.negocio.dominio;

/**
 * @author Usalmove
 *
 */
public class Carrera {

	private Integer idCarrera;
	private String nombre;
	private Integer cantidadMaterias;
	private Integer cantidadAnos;
	
	/**
	 * 
	 */
	public Carrera() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idCarrera
	 * @param nombre
	 * @param cantidadMaterias
	 * @param cantidadAnos
	 */
	public Carrera(Integer idCarrera, String nombre, Integer cantidadMaterias, Integer cantidadAnos) {
		this.idCarrera = idCarrera;
		this.nombre = nombre;
		this.cantidadMaterias = cantidadMaterias;
		this.cantidadAnos = cantidadAnos;
	}

	/**
	 * @return the idCarrera
	 */
	public Integer getIdCarrera() {
		return idCarrera;
	}

	/**
	 * @param idCarrera the idCarrera to set
	 */
	public void setIdCarrera(Integer idCarrera) {
		this.idCarrera = idCarrera;
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

	/**
	 * @return the cantidadMaterias
	 */
	public Integer getCantidadMaterias() {
		return cantidadMaterias;
	}

	/**
	 * @param cantidadMaterias the cantidadMaterias to set
	 */
	public void setCantidadMaterias(Integer cantidadMaterias) {
		this.cantidadMaterias = cantidadMaterias;
	}

	/**
	 * @return the cantidadAnos
	 */
	public Integer getCantidadAnos() {
		return cantidadAnos;
	}

	/**
	 * @param cantidadAnos the cantidadAnos to set
	 */
	public void setCantidadAnos(Integer cantidadAnos) {
		this.cantidadAnos = cantidadAnos;
	}

	
}
