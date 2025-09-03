package ejercicio1;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Iterator;

public class MainEjercicio1_b {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>(5);
        
        empleados.add(new Empleado("GERENTE", "47070553", "SOFIA", "SMITH", LocalDate.of(2005, 12, 31), "f", "calle falsa 123","1123156498", "sofianeduk@gmail.com"));
        empleados.add(new Empleado("CEO", "49070553", "MARA", "GOMEZ", LocalDate.of(2001, 9, 30), "f", "CALLE REAL 234","1136506498", "marag@gmail.com"));
        empleados.add(new Empleado("cajero", "47070999", "Sebastian", "Sarandi", LocalDate.of(2005, 2, 27), "m", "marabotto 8923","1123195468", "sebasarandi@gmail.com"));
        empleados.add(new Empleado("SEGURIDAD", "45960553", "MARCELO", "CASTRO", LocalDate.of(1990, 12, 1), "M", "CORRIENTES 670","1162598473", "castromarcelo@gmail.com"));
        empleados.add(new Empleado("Limpieza", "92584153", "Segundo", "Neduk", LocalDate.of(1973, 2, 6), "m", "conesa 3060","1159621498", "segundondk@gmail.com"));
        
        Iterator<Empleado> iterator = empleados.iterator();

        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println(empleado.toString());
        }
    }
}
