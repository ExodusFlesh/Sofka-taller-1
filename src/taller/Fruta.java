package taller;

import java.util.ArrayList;

/**
 * Representacion de una fruta y caracteristicas fisicas
 * @author Juan Steban ramirez
 *
 */

public class Fruta {

	/**
	 * Atributos de la clase
	 */
	public String name;
	private float averageWeight;
	public ArrayList<String> colors;
	
	
	/**
	 * Constructor
	 * Inicialización de un objeto tipo Fruta con los atributos de la clase
	 */
	
	public Fruta(String name, float averageWeight, ArrayList<String> colors) {
		this.name = name;
		this.averageWeight = averageWeight;
		this.colors = colors;
	}
	
	/**
	 * Getters y setters  de cada atributo
	 * Getters - metodos que solicitan el valor sobre el atributo
	 * Setters - metodos por el cual se establece el valor del atributo
	 * @param colors
	 */
	
	public void setColors(ArrayList<String> colors) {
		this.colors = colors;
	}
	
	public ArrayList<String> getColors() {
		return colors;
	}
	
	
}
