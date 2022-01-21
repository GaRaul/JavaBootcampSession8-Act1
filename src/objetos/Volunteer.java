package objetos;

public class Volunteer extends Employee {

	private double subvencion = 0;

	public Volunteer(String nombre, double salarioMensualBruto) {
		super(nombre, salarioMensualBruto);

	}

	// METODO PARA AÑADIR UNA SUBVENCION AL VOLUNTARIO
	public void aplicarSubvencion(double subvencion) {
		if (subvencion > 300) {
			this.subvencion = 300;
		} else {
			this.subvencion = subvencion;
		}
		
	}

	public double getSubvencion() {
		return subvencion;
	}
	

}