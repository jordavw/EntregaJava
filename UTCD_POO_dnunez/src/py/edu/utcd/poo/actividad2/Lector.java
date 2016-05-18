package py.edu.utcd.poo.actividad2;

/*
 * Se Crea la Clase Lector
 */
public class Lector {
	/*
	 * Le damos sus atributos a la clase
	 */
	private String numeroDeLector;
	private String telefono;
	private Persona Persona;
	private Alumno Alumno;
	private Docente Docente;

	/*
	 * Le creamos sus metodos
	 */
	public String getNumeroDeLector() {
		return numeroDeLector;
	}

	public void setNumeroDeLector(String numeroDeLector) {
		this.numeroDeLector = numeroDeLector;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Persona getPersona() {
		return Persona;
	}

	public void setPersona(Persona persona) {
		Persona = persona;
	}

	public Alumno getAlumno() {
		return Alumno;
	}

	public void setAlumno(Alumno alumno) {
		Alumno = alumno;
	}

	public Docente getDocente() {
		return Docente;
	}

	public void setDocente(Docente docente) {
		Docente = docente;
	}

}
