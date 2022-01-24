package objetos;

public class Boss extends Employee {

	private final String CARGO = "Boss";

	private String cargo = CARGO;

	public Boss(String nombre, double salarioMensual) {
		super(nombre, salarioMensual);

	}

	public void salarioFinal() {
		double salarioFinal;
		
		salarioFinal = super.salarioFinal(this.salarioMensual, this.cargo);
		
		this.salarioMensual = salarioFinal;
		
	}

}