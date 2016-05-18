package py.edu.utcd.poo.actividad1;

import java.util.Date;

//Declaramos la clase Subscripcion en el paquete
public class Subscripcion {
	/*
	 * Estos son los atributos de la clase
	 */
	private Date vencimiento; // Las instrucciones y declaraciones finalizan
								// con ;
	private String precio; /* Me falta el tipo de dato para el precio */
	private String destinatarioDeLaFactura;/*
											 * aun no se el tipo de dato para el
											 * destinatario
											 */
	private Cliente Cliente;/*
							 * señalamos la clase cliente a la clase
							 * subscripcion
							 */

	/*
	 * Debajo estan los Metodos
	 */

	public Date getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(Date vencimiento) {
		this.vencimiento = vencimiento;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getDestinatarioDeLaFactura() {
		return destinatarioDeLaFactura;
	}

	public void setDestinatarioDeLaFactura(String destinatarioDeLaFactura) {
		this.destinatarioDeLaFactura = destinatarioDeLaFactura;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

}
