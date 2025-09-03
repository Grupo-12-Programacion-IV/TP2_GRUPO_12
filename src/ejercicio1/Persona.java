package ejercicio1;

import java.time.LocalDate;
import java.util.Objects;

public class Persona {

	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	
	
	public Persona () {
		nombre = "Sin Nombre";
		fechaNacimiento = LocalDate.of(2025, 1, 1);
	}
	

	public Persona(String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	
	public Persona (String dni) {
		this.dni = dni;
		nombre = "Sin Nombre";
		fechaNacimiento = LocalDate.of(2025, 1, 1);
	}
	
	public int hashCode() {
		return Objects.hash(apellido, direccion, dni, email, fechaNacimiento, genero, nombre, telefono);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(apellido, other.apellido) && Objects.equals(direccion, other.direccion)
				&& Objects.equals(dni, other.dni) && Objects.equals(email, other.email)
				&& Objects.equals(fechaNacimiento, other.fechaNacimiento) && Objects.equals(genero, other.genero)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}


	public String toString() {
		return "Datos de la persona: dni: " + dni + ", nombre: " + nombre + ", apellido: " + apellido + ", fechaNacimiento: "
				+ fechaNacimiento + ", genero: " + genero + ", direccion: " + direccion + ", telefono: " + telefono
				+ ", email: " + email;
	}
	
	//MÉTODOS
	public static boolean exVerificarDNI(String dni) throws exVerificarDNI
	{
		boolean auxDNI = true;
		
		if(dni.length() != 8)
		{
			auxDNI = false;
			exVerificarDNI exc = new exVerificarDNI();
			throw exc;
		}
		return auxDNI;
	}
}

