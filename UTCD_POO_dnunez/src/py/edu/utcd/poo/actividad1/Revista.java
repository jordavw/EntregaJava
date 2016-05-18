package py.edu.utcd.poo.actividad1;

import java.util.Date;

public class Revista {
	/*
	 * Atributos
	 */
	private String nombre;
	private Date periodoDePublicacion;
	private Subscripcion Subscripcion;

	/*
	 * Declaramos los metodos para los atributos de la clase revista
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getPeriodoDePublicacion() {
		return periodoDePublicacion;
	}

	public void setPeriodoDePublicacion(Date periodoDePublicacion) {
		this.periodoDePublicacion = periodoDePublicacion;
	}

	public Subscripcion getSubscripcion() {
		return Subscripcion;
	}

	public void setSubscripcion(Subscripcion subscripcion) {
		Subscripcion = subscripcion;
	}

}