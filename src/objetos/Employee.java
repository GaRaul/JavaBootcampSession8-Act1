package objetos;

public abstract class Employee {

	private final double SALARIOBASE = 901;

	protected String nombre = "";
	protected double salarioMensual = SALARIOBASE;

	public Employee() {
	}

	public Employee(String nombre) {
		this.nombre = nombre;
	}

	public Employee(String nombre, double salarioMensual) {

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

		salarioMensual = salarioMensual - (salarioMensual * 0.15);

		return salarioMensual;
	}

}