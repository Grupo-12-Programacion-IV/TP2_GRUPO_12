package ejercicio2;

public class EdificioDeOficinas extends Edificio
{
	// PROPIEDADES
	private int cantOficianas;
	
	// CONSTRUCTOR/ES
	public EdificioDeOficinas(){}
	public EdificioDeOficinas(int cantOficianas)
	{
		this.cantOficianas = cantOficianas;
	}
	
	// GETTERS Y SETTERS
	public int getCantOficianas()
	{
		return cantOficianas;
	}
	public void setCantOficianas(int cantOficianas)
	{
		this.cantOficianas = cantOficianas;
	}
	
	// MÉTODOS
}