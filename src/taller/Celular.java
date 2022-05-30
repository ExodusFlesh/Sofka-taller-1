package taller;

/**
 * Representacion de un celular y algunas caracteristicas
 * @author Juan Steban Ramirez
 *
 */

public class Celular {

	/**
	 * Atributos de la clase
	 */
	protected String manufacter;
	public int model;
	private double imei;
	public String systemOs;
	public int storageCapacity;
	
	
	/**
	 * Constructor
	 * Inicialización de un objeto tipo Celular con los atributos de la clase
	 */
	
	public Celular(String manufacter, int model, double imei, String systemOs, int storageCapacity) {
		this.manufacter = manufacter;
		this.model = model;
		this.imei = imei;
		this.systemOs = systemOs;
		this.storageCapacity = storageCapacity;
	}

	/**
	 * Getters y setters  de cada atributo
	 * Getters - metodos que solicitan el valor sobre el atributo
	 * Setters - metodos por el cual se establece el valor del atributo
	 * @param manufacter
	 */
	
	protected String getManufacter() {
		return manufacter;
	}

	/**
	 * @param model 
	 */
	
	protected int getModel() {
		return model;
	}

	/**
	 * @param imei 
	 */
	
	private double getImei() {
		return imei;
	}

	/**
	 * @param systemOs
	 */
	
	public String getSystemOs() {
		return systemOs;
	}

	public void setSystemOs(String systemOs) {
		this.systemOs = systemOs;
	}

	/**
	 * @param storageCapacity
	 */
	
	public int getStorageCapacity() {
		return storageCapacity;
	}

	protected void setStorageCapacity(int storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	
}
