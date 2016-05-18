package py.edu.utcd.poo.actividad1;

import java.util.Date;

/*importamos la utilidad para manejar fechas
 * Declaramos la clase en el package
 */

public class Reclamo {
	/*
	 * Declaramos los Atributos para la clase reclamo
	 */
	private Date fecha;
	private Long notaReferencia;
	private Subscripcion Subscripcion;
	private Reclamo Reclamo;

	/*
	 * declaramos los atributos Metodos
	 */

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Long getNotaReferencia() {
		return notaReferencia;
	}

	public void setNotaReferencia(Long notaReferencia) {
		this.notaReferencia = notaReferencia;
	}

	public Subscripcion getSubscripcion() {
		return Subscripcion;
	}

	public void setSubscripcion(Subscripcion subscripcion) {
		Subscripcion = subscripcion;
	}

	public Reclamo getReclamo() {
		return Reclamo;
	}

	public void setReclamo(Reclamo reclamo) {
		Reclamo = reclamo;
	}

}