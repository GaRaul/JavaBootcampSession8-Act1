package objetos;

public abstract class Manager {

	private final double SALARIOBASE = 3001;

	private String nombre = "";
	private double salarioMensual = SALARIOBASE;

	public Manager() {
	}

	public Manager(String nombre) {
		this.nombre = nombre;
	}

	public Manager(String nombre, double salarioMensual) {

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

		salarioMensual *= 1.1;

		return salarioMensual;
	}

}