package taller;

/**
 * Representación de una cuenta bancaria
 * @author Juan Steban ramirez
 *
 */

public class CuentaBancaria {
	
	/**
	 * Atributos de la clase
	 */
	private int accountNumber;
	protected boolean activated;
	
	/**
	 * Constructor
	 * Inicialización de un objeto tipo CuentaBancaria con los atributos de la clase
	 */
	
	public CuentaBancaria(int accountNumber, boolean activated) {
		this.accountNumber = accountNumber;
		this.activated = activated;
	}

	/**
	 * Getters y setters  de cada atributo
	 * Getters - metodos que solicitan el valor sobre el atributo
	 * Setters - metodos por el cual se establece el valor del atributo
	 * @param activated
	 */
	
	public boolean getActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}
	
	
	
}
