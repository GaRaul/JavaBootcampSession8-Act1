package objetos;

public class Manager extends Employee {

	private final String CARGO = "Manager";

	private String cargo = CARGO;

	public Manager(String nombre, double salarioMensual) {
		super(nombre, salarioMensual);

	}

	public void salarioFinal() {
		double salarioFinal;
		
		salarioFinal = super.salarioFinal(this.salarioMensual, this.cargo);
		
		this.salarioMensual = salarioFinal;
		
	}

	@Override
	public String toString() {
		return "Manager [CARGO=" + CARGO + ", cargo=" + cargo + ", nombre=" + nombre + ", salarioMensual="
				+ salarioMensual + "]";
	}
	

}