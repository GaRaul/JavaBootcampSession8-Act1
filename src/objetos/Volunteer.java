package objetos;

public abstract class Volunteer {
	
	private String nombre = "";

	public Volunteer() {
	}

	public Volunteer(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}