package ejercicio1;

import java.time.LocalDate;

public class Empleado extends Persona{
	private final int legajo;
	private String puesto;
	private static int cont = 1000;
	
	//Getters y setters
	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getLegajo() {
		return legajo;
	}

	//Constructors
	public Empleado () {
		super();
		
		this.legajo = cont;
		cont++;
		
	}
	Empleado(String puesto, String dni, String nombre, String apellido, LocalDate fechaNacimiento, String genero, String direccion, String telefono, String email){
		super(dni, nombre, apellido, fechaNacimiento, genero, direccion, telefono, email);
		
		legajo = cont; 
		this.puesto = puesto;
		cont++;
		
	}

	//Métodos
	@Override
	public String toString() {
		return "Datos del empleado: legajo: " + legajo + ", puesto:" + puesto + ", " + super.toString();
	}		
	
	static public int devuelveProximoLegajo() {
		return cont;
	}
}
