package ejercicio1;

public class MainEjercicio1_a {
    public static void main(String[] args) {
    	String[] dnis = {"AA202020", "20202020"}; 
    	 
    	for (String dni : dnis) {
        try {
        	Persona Per = new Persona(dni);
        	// DNI valido
            System.out.println("\n" + "Persona agregada correctamente");
       
        } catch (exVerificarDNI ex) {
            // DNI invalido
            System.out.println("\n" + "Persona no agregada por no verificar el DNI");
        }
    }
  }
}
    
