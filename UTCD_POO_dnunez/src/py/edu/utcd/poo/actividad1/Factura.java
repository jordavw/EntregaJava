package py.edu.utcd.poo.actividad1;

//Importamos la clase para manejar fechas

import java.util.Date;

/*
 * Declaramos la Clase factura
 */
public class Factura {

	/*
	 * Metodos Cuando tenemos todas las clases hacer las asociaciones de las
	 * clases con import java.util.Date Aqui insertamos los atributos de cada
	 * metodo
	 */
	private Date fechaEmision;
	private Date fechaPago;
	private Cliente Cliente;

	/*
	 * Los metodos
	 */
	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

}
