package py.edu.utcd.poo.actividad1; // Jorge David Nuñez Duarte ( Actividad 1)

/* 
 * Declaramos la clase cliente
 */
public class Cliente {
	/*
	 * Declaramos los atributos como privado para la clase cliente
	 */
	private String nombre;
	private String apellido;
	private Long nroCedula;
	private String direccion;
	private Factura Factura;

	/*
	 * Metodos
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getNroCedula() {
		return nroCedula;
	}

	public void setNroCedula(Long nroCedula) {
		this.nroCedula = nroCedula;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Factura getFactura() {
		return Factura;
	}

	public void setFactura(Factura factura) {
		Factura = factura;
	}

}
