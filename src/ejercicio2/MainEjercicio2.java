package ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio2 {

    public static void main(String[] args) {
        // Creacion de ArrayList para almacenar edificios
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Crecion de polideportivos
        Polideportivo polideportivo1 = new Polideportivo("Polideportivo Municipal", 2500.5, 1);
        Polideportivo polideportivo2 = new Polideportivo("Centro Deportivo Universitario", 1800.0, 2);
        Polideportivo polideportivo3 = new Polideportivo("Complejo Deportivo Privado", 3200.75, 3);

        // Agregar polideportivos al ArrayList
        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(polideportivo3);

        // Crear iterator para recorrer el ArrayList
        Iterator<Edificio> iterator = edificios.iterator();

        // Recorrer el ArrayList usando el iterator
        while (iterator.hasNext()) {
            Edificio edificio = iterator.next();

        }

    }
}
