package py.edu.utcd.poo.actividad2;

import java.util.Date;

/*
 * Se crea la clase Autor
 */
public class Autor {
	/*
	 * Le añadimos los atributos y lo asociamos con la clase padre Persona
	 */
	private Date fechaDeNacimiento;
	private Persona Persona;

	/*
	 * Le colocamos sus metodos
	 */
	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public Persona getPersona() {
		return Persona;
	}

	public void setPersona(Persona persona) {
		Persona = persona;
	}

}
