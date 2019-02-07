package paquete2;

public class Persona {
	private int edad;
	private String nombre;
	private String genero;
	public Persona(int edad, String nombre, String genero) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getMnombre() {
		return nombre;
	}
	public void setMnombre(String mnombre) {
		this.nombre = mnombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
