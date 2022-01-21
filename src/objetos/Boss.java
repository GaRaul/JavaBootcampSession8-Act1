package objetos;

public abstract class Boss {

	private final double SALARIOBASE = 8001;
	
	private String nombre = "";
	private double salarioMensual = SALARIOBASE;

	public Boss() {
	}

	public Boss(String nombre) {
		this.nombre = nombre;
	}

	public Boss(String nombre, double salarioMensual) {

		this.nombre = nombre;
		this.salarioMensual = salarioFinal(salarioMensual);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	
	private double salarioFinal(double salarioMensual) {
		
		salarioMensual *= 1.5;
		
		return salarioMensual;
	}

}
