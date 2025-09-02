package ejercicio1;

public class MainEjercicio1_a {
    public static void main(String[] args) {

        try {
            // DNI valido
            System.out.println("Persona agregada correctamente");
        } catch (exVerificarDNI ex) {
            // DNI invalido
            System.out.println("Persona no agregada por no verificar el DNI");
        }
    }
}
