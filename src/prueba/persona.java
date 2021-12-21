package prueba;

public class persona {
	
	
	private Integer edad;
	private String nombre;
	private static persona instancia;
	
	public persona(Integer edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	
	
	public static persona Instancia(Integer edad, String nombre) {
		if(instancia == null) {
			instancia = new persona(edad, nombre);
		}
		return instancia;
	}
	
	
	
	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
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
