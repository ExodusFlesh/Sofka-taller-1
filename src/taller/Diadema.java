package taller;

/**
 * Representacion de una diadema y sus caracteristicas
 * @author Juan Steban Ramirez
 *
 */

public class Diadema {

	/**
	 * Atributos de la clase
	 */
	private int idItem;
	protected String manufacter;
	public boolean wireless;
	public String style;
	

	/**
	 * Constructor
	 * Inicialización de un objeto tipo Diadema con los atributos de la clase
	 */
	public Diadema(int idItem, String manufacter, boolean wireless, String style) {
		this.idItem = idItem;
		this.manufacter = manufacter;
		this.wireless = wireless;
		this.style = style;
	}

	/**
	 * Getters y setters  de cada atributo
	 * Getters - metodos que solicitan el valor sobre el atributo
	 * Setters - metodos por el cual se establece el valor del atributo
	 * @param idItem
	 */
	
	public int getIdItem() {
		return idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	
	/**
	 * @param manufacter
	 */
	public String getManufacter() {
		return manufacter;
	}

	public void setManufacter(String manufacter) {
		this.manufacter = manufacter;
	}
	
	/**
	 * @param wireless
	 */
	protected boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}

	/**
	 * @param style
	 */
	protected String getStyle() {
		return style;
	}

	private void setStyle(String style) {
		this.style = style;
	}
	
}
