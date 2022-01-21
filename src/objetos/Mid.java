package objetos;

public class Mid extends Employee {

	private final String CARGO = "Mid";

	private String cargo = CARGO;

	public Mid(String nombre, double salarioMensual) {
		super(nombre, salarioMensual);

	}

//	public boolean sueldoValido() {
//		boolean esValido;
//
//		esValido = super.sueldoValido(this.cargo, this.salarioMensual);
//
//		return esValido;
//
//	}

	public void salarioFinal() {
		double salarioFinal;
		
		salarioFinal = super.salarioFinal(this.salarioMensual, this.cargo);
		
		this.salarioMensual = salarioFinal;
		
	}

}