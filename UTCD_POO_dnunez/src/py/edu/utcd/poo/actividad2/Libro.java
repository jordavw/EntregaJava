package py.edu.utcd.poo.actividad2;

/*
 * Creamos la clase Libro
 */
public class Libro {

	/*
	 * Declaramos los atributos y lo asociamos con su clase padre Autor
	 */
	private String titulo;
	private String editorial;
	private int ediciones;
	private Autor Autor;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getEdiciones() {
		return ediciones;
	}

	public void setEdiciones(int ediciones) {
		this.ediciones = ediciones;
	}

	public Autor getAutor() {
		return Autor;
	}

	public void setAutor(Autor autor) {
		Autor = autor;
	}

	/*
	 * Declarmos los Metodos
	 */

}
