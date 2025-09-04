package ejercicio2;

public class Polideportivo extends Edificio implements IInstalacionDeportiva {

	public String nombre;
	
	
 //getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public int getTipoDeInstalacion() {
		return 0;
	}

}
