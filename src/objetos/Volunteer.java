package objetos;

public class Volunteer extends Employee {

	private final String CARGO = "Volunteer";

	private String cargo = CARGO;

	public Volunteer(String nombre, double salarioMensual) {
		super(nombre, salarioMensual);

	}

	public void salarioFinal() {
		double salarioFinal;
		
		salarioFinal = super.salarioFinal(this.salarioMensual, this.cargo);
		
		this.salarioMensual = salarioFinal;
		
	}

}