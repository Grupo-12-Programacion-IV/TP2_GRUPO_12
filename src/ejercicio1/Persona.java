package ejercicio1;

import java.time.LocalDate;

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

	public String toString() {
		return "Datos de la persona: dni: " + dni + ", nombre: " + nombre + ", apellido: " + apellido + ", fechaNacimiento: "
				+ fechaNacimiento + ", genero: " + genero + ", direccion: " + direccion + ", telefono: " + telefono
				+ ", email: " + email;
	}
	
	
}
