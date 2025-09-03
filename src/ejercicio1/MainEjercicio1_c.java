package ejercicio1;

import java.time.LocalDate;
import java.util.TreeSet;

public class MainEjercicio1_c {

	public static void main(String[] args) {
		TreeSet <Empleado> listaEmpleados = new TreeSet<Empleado>();

		Empleado p1 = new Empleado ("Profesor", "40123456", "Marcela", "Lopez", LocalDate.of (1998, 9, 18), "Femenino", "Calle Falsa 123", "123456789", "empleado1@gmail.com");
		Empleado p2 = new Empleado ("Chofer", "41234567", "Thomas", "Rodriguez", LocalDate.of (2000, 1, 23), "Masculino", "Calle Falsa 234", "234567891", "empleado2@gmail.com");
		Empleado p3 = new Empleado ("Peluquera", "42345678", "Sabrina", "Villaverde", LocalDate.of (2001, 4, 1), "Femenino", "Calle Falsa 345", "345678912", "empleado3@gmail.com");
		Empleado p4 = new Empleado ("Carpintero", "43456789", "Marcela", "Lopez", LocalDate.of (2002, 8, 30), "Femenino", "Calle Falsa 456", "456789123", "empleado4@gmail.com");
		Empleado p5 = new Empleado ("Chef", "44567891", "Claudio", "Wood", LocalDate.of (2003, 3, 11), "Masculino", "Calle Falsa 567", "567891234", "empleado5@gmail.com");

		listaEmpleados.add(p1);
		listaEmpleados.add(p2); 
		listaEmpleados.add(p3); 
		listaEmpleados.add(p4); 
		listaEmpleados.add(p5); 


	}

}
