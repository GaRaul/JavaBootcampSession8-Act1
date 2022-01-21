package objetos;

public class Senior extends Employee {

	private final String CARGO = "Senior";
	
	private String cargo = CARGO;
	
	public Senior(String nombre, double salarioMensual) {
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
