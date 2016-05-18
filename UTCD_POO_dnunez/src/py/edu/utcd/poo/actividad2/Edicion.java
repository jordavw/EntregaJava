package py.edu.utcd.poo.actividad2;

import java.util.Date;

/*
 * Creamos la clase edicion
 */
public class Edicion {
	/*
	 * Creamos los atributos para la clase Edicion y lo asociamos con la clase
	 * Libro
	 */
	private Date fechaDePublicacion;
	private int numeroDeEjemplar;
	private Long Isbn;
	private Libro Libro;

	/*
	 * Creamos los metodos para los atributos
	 */
	public Date getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(Date fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	public int getNumeroDeEjemplar() {
		return numeroDeEjemplar;
	}

	public void setNumeroDeEjemplar(int numeroDeEjemplar) {
		this.numeroDeEjemplar = numeroDeEjemplar;
	}

	public Long getIsbn() {
		return Isbn;
	}

	public void setIsbn(Long isbn) {
		Isbn = isbn;
	}

	public Libro getLibro() {
		return Libro;
	}

	public void setLibro(Libro libro) {
		Libro = libro;
	}

}
