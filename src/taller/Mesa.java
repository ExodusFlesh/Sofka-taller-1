package taller;

/**
 * Representación de una mesa y sus caracteristicas
 * @author Juan Steban ramirez
 *
 */

public class Mesa {

	/**
	 * Atributos de la clase
	 */
	public String name;
	public String material;
	protected float height;
	protected float width;
	private double itemKey;
	
	/**
	 * Constructor
	 * Inicialización de un objeto tipo Mesa con los atributos de la clase
	 */
	
	public Mesa(String name, String material, float height, float width, double itemKey) {
		this.name = name;
		this.material = material;
		this.height = height;
		this.width = width;
		this.itemKey = itemKey;
	}

	/**
	 * Getters y setters  de cada atributo
	 * Getters - metodos que solicitan el valor sobre el atributo
	 * Setters - metodos por el cual se establece el valor del atributo
	 * @param name
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * @param material
	 */
	
	protected String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * @param height
	 */
	
	protected float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	/**
	 * @param width
	 */
	
	protected float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	/**
	 * @param itemKey
	 */
	
	private double getItemKey() {
		return itemKey;
	}
	
}
