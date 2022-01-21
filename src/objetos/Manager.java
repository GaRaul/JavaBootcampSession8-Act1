package objetos;

public class Manager extends Employee {

	private final String CARGO = "Manager";

	private String cargo = CARGO;

	public Manager(String nombre, double salarioMensualBruto) {
		super(nombre, salarioMensualBruto);

	}

	public void salarioMensualBruto() {
		double salarioMensualBruto;
		
		salarioMensualBruto = super.salarioMensualBruto(this.cargo);
		
		this.salarioMensualBruto = salarioMensualBruto;
		
	}
	
	public void salarioMensualNeto() {
		double salarioMensualNeto;
		
		salarioMensualNeto = super.salarioMensualNeto(this.cargo);
		
		this.salarioMensualNeto = salarioMensualNeto;
	}

	public void calcularSueldoAnualBruto() {
		double salarioAnualBruto;
		
		salarioAnualBruto = super.calcularSueldoAnualBruto(this.salarioMensualBruto);
		
		this.salarioAnualBruto = salarioAnualBruto;
	}

	public void calcularSueldoAnualNeto() {
		double salarioAnualNeto;
		
		salarioAnualNeto = super.calcularSueldoAnualNeto(this.cargo);
		
		this.salarioAnualNeto = salarioAnualNeto;
	}

	public void bonus() {
		this.salarioAnualBruto = super.bonus(this.salarioAnualBruto);
		this.salarioAnualNeto = calcularSueldoAnualNeto(this.cargo);

	}
	
}