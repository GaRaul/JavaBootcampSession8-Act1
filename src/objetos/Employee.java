package objetos;

public abstract class Employee {

	// ATRIBUTAS
	protected String nombre = "";
	protected double salarioMensualBruto;
	protected double salarioMensualNeto;
	protected double salarioAnualBruto;
	protected double salarioAnualNeto;

	// CONSTRUCTOR
	protected Employee(String nombre, double salarioMensualBruto) {

		this.nombre = nombre;
		this.salarioMensualBruto = salarioMensualBruto;

	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSalarioMensualBruto() {
		return salarioMensualBruto;
	}

	public void setSalarioMensualBruto(double salarioMensualBruto) {
		this.salarioMensualBruto = salarioMensualBruto;
	}

	public double getSalarioMensualNeto() {
		return salarioMensualNeto;
	}

	public void setSalarioMensualNeto(double salarioMensualNeto) {
		this.salarioMensualNeto = salarioMensualNeto;
	}

	public double getSalarioAnualBruto() {
		return salarioAnualBruto;
	}

	public void setSalarioAnualBruto(double salarioAnualBruto) {
		this.salarioAnualBruto = salarioAnualBruto;
	}

	public double getSalarioAnualNeto() {
		return salarioAnualNeto;
	}

	public void setSalarioAnualNeto(double salarioAnualNeto) {
		this.salarioAnualNeto = salarioAnualNeto;
	}

	// METODO PARA CALCULAR EL SALARIO MENSUAL BRUTO CON LAS REDUCCIONES DE SUELDO
	protected double salarioMensualBruto(String cargo) {
		double salarioMensualBrutoFinal;

		if (cargo.equals("Boss")) {
			salarioMensualBrutoFinal = this.salarioMensualBruto;

			if (!sueldoValido(cargo, salarioMensualBrutoFinal)) {
				salarioMensualBrutoFinal = 8001;
			}

		} else if (cargo.equals("Manager")) {
			salarioMensualBrutoFinal = this.salarioMensualBruto;

			if (!sueldoValido(cargo, salarioMensualBrutoFinal)) {
				if (salarioMensualBrutoFinal < 3000) {
					salarioMensualBrutoFinal = 3001;
				} else {
					salarioMensualBrutoFinal = 4999;
				}
			}

		} else if (cargo.equals("Senior")) {
			salarioMensualBrutoFinal = this.salarioMensualBruto - (this.salarioMensualBruto * 0.05);

			if (!sueldoValido(cargo, salarioMensualBrutoFinal)) {
				salarioMensualBrutoFinal = 2700;
			}

		} else if (cargo.equals("Mid")) {
			salarioMensualBrutoFinal = this.salarioMensualBruto - (this.salarioMensualBruto * 0.10);

			if (!sueldoValido(cargo, salarioMensualBrutoFinal)) {
				salarioMensualBrutoFinal = 1800;
			}

		} else {
			salarioMensualBrutoFinal = this.salarioMensualBruto - (this.salarioMensualBruto * 0.15);

			if (!sueldoValido(cargo, salarioMensualBrutoFinal)) {
				salarioMensualBrutoFinal = 900;
			}
		}

		return salarioMensualBrutoFinal;

	}

	// METODO QUE APLICA EL IRPF AL SUELDO BRUTO Y LO GUARDA EN EL SALARIO NETO
	protected double salarioMensualNeto(String cargo) {
		double salarioMensualNeto;
		
		if (cargo.equals("Boss")) {
			salarioMensualNeto = this.salarioMensualBruto - (this.salarioMensualBruto * 0.32);

		} else if (cargo.equals("Manager")) {
			salarioMensualNeto =this.salarioMensualBruto - (this.salarioMensualBruto * 0.26);

		} else if (cargo.equals("Senior")) {
			salarioMensualNeto =this.salarioMensualBruto - (this.salarioMensualBruto * 0.24);
			
		} else if (cargo.equals("Mid")) {
			salarioMensualNeto =this.salarioMensualBruto - (this.salarioMensualBruto * 0.15);

		} else {
			salarioMensualNeto =this.salarioMensualBruto - (this.salarioMensualBruto * 0.02);

		}
		
		return salarioMensualNeto;

	}
	
	// METODO QUE CALCULA EL SUELDO ANUAL BRUTO
	protected double calcularSueldoAnualBruto(double salarioMensualBruto) {
		double salarioAnualBruto;
		
		salarioAnualBruto = salarioMensualBruto * 12;
		
		return salarioAnualBruto;
	}
	
	// METODO QUE CALCULA EL SUELDO ANUAL NETO
	protected double calcularSueldoAnualNeto(String cargo) {
		double salarioAnualNeto;
		
		if (cargo.equals("Boss")) {
			salarioAnualNeto = this.salarioAnualBruto - (this.salarioAnualBruto * 0.32);

		} else if (cargo.equals("Manager")) {
			salarioAnualNeto = this.salarioAnualBruto - (this.salarioAnualBruto * 0.26);

		} else if (cargo.equals("Senior")) {
			salarioAnualNeto = this.salarioAnualBruto - (this.salarioAnualBruto * 0.24);
			
		} else if (cargo.equals("Mid")) {
			salarioAnualNeto = this.salarioAnualBruto - (this.salarioAnualBruto * 0.15);

		} else {
			salarioAnualNeto = this.salarioAnualBruto - (this.salarioAnualBruto * 0.02);

		}
		
		return salarioAnualNeto;

	}
	
	// METODO QUE EMITE UN BONUS DEL 10% AL SUELDO ANUAL BRUTO
	protected double bonus(double salarioAnualBruto) {
		double salarioAnualBrutoMasBonus;
		
		salarioAnualBrutoMasBonus = salarioAnualBruto * 1.10;
		
		return salarioAnualBrutoMasBonus;
	}
	
	protected boolean sueldoValido(String cargo, double salarioMensualBruto) {

		if (cargo.equals("Boss")) {
			if (salarioMensualBruto > 8000) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Manager")) {
			if (salarioMensualBruto > 3000 && salarioMensualBruto < 5000) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Senior")) {
			if (salarioMensualBruto > 2700 && salarioMensualBruto < 4000) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Mid")) {
			if (salarioMensualBruto > 1800 && salarioMensualBruto < 2500) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Junior")) {
			if (salarioMensualBruto > 900 && salarioMensualBruto < 1600) {
				return true;
			} else {
				return false;
			}

		} else {
			if (salarioMensualBruto == 0) {
				return true;
			} else {
				return false;
			}
		}

	}

}