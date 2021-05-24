/**
 * 
 */
package edu.usal.negocio.dominio;

/**
 * @author Usalmove
 *
 */
public class Clases {

	private Integer nroClase;
	private int[] tamano = new int[2];
	private int mesas;
	private String pizarron;
	
	private final String[] tPizarron = {"Blanco", "Verde", "Negro", "Digital", "Virtual","Cañon"};

	/**
	 * 
	 */
	public Clases() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param nroClase
	 * @param tamano
	 * @param mesas
	 * @param pizarron
	 */
	public Clases(Integer nroClase, int[] tamano, int mesas, String pizarron) {
		this.nroClase = nroClase;
		this.tamano = tamano;
		this.mesas = mesas;
		this.pizarron = pizarron;
	}

	/**
	 * @return the nroClase
	 */
	protected Integer getNroClase() {
		return nroClase;
	}

	/**
	 * @param nroClase the nroClase to set
	 */
	protected void setNroClase(Integer nroClase) {
		this.nroClase = nroClase;
	}

	/**
	 * @return the tamano
	 */
	protected int[] getTamano() {
		return tamano;
	}

	/**
	 * @param tamano the tamano to set
	 */
	protected void setTamano(int[] tamano) {
		this.tamano = tamano;
	}

	/**
	 * @return the mesas
	 */
	protected int getMesas() {
		return mesas;
	}

	/**
	 * @param mesas the mesas to set
	 */
	protected void setMesas(int mesas) {
		this.mesas = mesas;
	}

	/**
	 * @return the pizarron
	 */
	protected String getPizarron() {
		return pizarron;
	}

	/**
	 * @param pizarron the pizarron to set
	 */
	protected void setPizarron(String pizarron) {
		this.pizarron = pizarron;
	}

	/**
	 * @return the tPizarron
	 */
	protected String[] gettPizarron() {
		return tPizarron;
	}

}
