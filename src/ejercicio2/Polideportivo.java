package ejercicio2;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {

	public String nombre;
	public int tipoInstalacion;
	
	public Polideportivo(String nombre, double superficie, int tipoInstalacion) {
        super(superficie);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }
	
	
 //getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipoDeInstalacion() {
		return 0;
	}


	//ToString
	public String toString() {
		return "Polideportivo nombre=" + nombre + ", tipoInstalacion=" + tipoInstalacion;
	}
	
	//ToString
	

}
