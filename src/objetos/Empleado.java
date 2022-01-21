package objetos;

public abstract class Empleado {

	protected String nombreEmpleado = "";
	protected double salarioMensual = 0.00;

	public Empleado() {

	}

	public Empleado(String nombreEmpleado) {
	
		this.nombreEmpleado = nombreEmpleado;
	}

	public Empleado(String nombreEmpleado, double salarioMensual) {

		this.nombreEmpleado = nombreEmpleado;
		this.salarioMensual = salarioMensual;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public void setNombreEmpleado(String nombreEmpleado) {
		this.nombreEmpleado = nombreEmpleado;
	}

	public double getSalarioMensual() {
		return salarioMensual;
	}

	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}

}
