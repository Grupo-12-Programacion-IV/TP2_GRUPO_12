package ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEjercicio1_b {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();

        Iterator<Empleado> iterator = empleados.iterator();

        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            System.out.println(empleado.toString());
        }
    }
}
