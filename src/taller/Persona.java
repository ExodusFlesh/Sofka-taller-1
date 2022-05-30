package taller;

import java.util.Date;

/**
 *  Clase que representa una persona 
 * @author Juan Steban ramirez
 *
 */

public class Persona {
	
	/**
	 * Atributos de la clase
	 */
	public String name;
	public String lastName1;
	public String lastName2;
	public Date dateBirth;
	public float height;
	
	/**
	 * Constructor
	 * Inicialización de un objeto tipo Persona con los atributos de la clase
	 */
	
	public Persona(String name, String lastName1, String lastName2, Date dateBirth, Float height) {
		this.name = name;
		this.lastName1 = lastName1;
		this.lastName2 = lastName2;
		this.dateBirth = dateBirth;
		this.height = height;
	}
	
	/**
	 * Getters y setters  de cada atributo
	 * Getters - metodos que solicitan el valor sobre el atributo
	 * Setters - metodos por el cual se establece el valor del atributo
	 * @param name
	 */
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}	
}
