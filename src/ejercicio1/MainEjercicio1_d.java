package ejercicio1;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;

public class MainEjercicio1_d {
	 public static void main(String[] args) {
		 Persona P1 = new Persona("12345678", "Ramiro", "Gomez", LocalDate.of(1990, 5, 12), "Masculino", "Calle Salsa 123, Ciudad", "01112345678", "ramiro.gomez@email.com");
		 Persona P2 = new Persona("87654321", "Lucia", "Gonzalez", LocalDate.of(1985, 8, 23), "Femenino", "Av. Siempre Viva 742, Ciudad", "01187654321", "lucia.gonzalez@email.com");
		 Persona P3 = new Persona("11223344", "Sofia", "Martinez", LocalDate.of(2000, 2, 10), "Femenino", "Calle Libertad 45, Ciudad", "01111223344", "sofia.martinez@email.com");
		 Persona P4 = new Persona("44332211", "Carlos", "Ramirez", LocalDate.of(1995, 11, 30), "Masculino", "Boulevard Central 98, Ciudad", "01144332211", "carlos.ramirez@email.com");
		 Persona P5 = new Persona("55667788", "Valentina", "Lopez", LocalDate.of(1992, 7, 5), "Femenino", "Calle del Sol 77, Ciudad", "01155667788", "valentina.lopez@email.com");

		 
		 HashSet<Persona> ListaPersonas = new HashSet<Persona>();
		 ListaPersonas.add(P1);
		 ListaPersonas.add(P2);
		 ListaPersonas.add(P3);
		 ListaPersonas.add(P4);
		 ListaPersonas.add(P5);
		 
		 Iterator <Persona> iterator = ListaPersonas.iterator();
		 while (iterator.hasNext()) {
		 Persona persona = iterator.next();
		 System.out.println(persona.toString());
		 }
	 }
}
