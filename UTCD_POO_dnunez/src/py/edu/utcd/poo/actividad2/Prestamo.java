package py.edu.utcd.poo.actividad2;

import java.util.Date;

/*
 * Creamos la clase prestamo
 */
public class Prestamo {
	/*
	 * Le añadimos los atributos a la clase
	 */
	private String prestamoPendiente;
	private Date fechaDePrestamo;
	private Date fechaDeDevolucion;
	private char ejemplares;
	private String estado;
	private Lector Lector;

	/*
	 * Creamos a los atributos los metodos
	 */
	public String getPrestamoPendiente() {
		return prestamoPendiente;
	}

	public void setPrestamoPendiente(String prestamoPendiente) {
		this.prestamoPendiente = prestamoPendiente;
	}

	public Date getFechaDePrestamo() {
		return fechaDePrestamo;
	}

	public void setFechaDePrestamo(Date fechaDePrestamo) {
		this.fechaDePrestamo = fechaDePrestamo;
	}

	public Date getFechaDeDevolucion() {
		return fechaDeDevolucion;
	}

	public void setFechaDeDevolucion(Date fechaDeDevolucion) {
		this.fechaDeDevolucion = fechaDeDevolucion;
	}

	public char getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(char ejemplares) {
		this.ejemplares = ejemplares;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Lector getLector() {
		return Lector;
	}

	public void setLector(Lector lector) {
		Lector = lector;
	}

}
