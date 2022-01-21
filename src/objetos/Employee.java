package objetos;

public abstract class Employee {

	protected String nombre = "";
	protected double salarioMensual;

	protected Employee(String nombre, double salarioMensual) {

		this.nombre = nombre;
		this.salarioMensual = salarioMensual;

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

	protected double salarioFinal(double salarioMensual, String cargo) {
		double salarioFinal;

		if (cargo.equals("Boss")) {
			salarioFinal = this.salarioMensual;

			if (!sueldoValido(cargo, salarioFinal)) {
				salarioFinal = 8001;
			}

		} else if (cargo.equals("Manager")) {
			salarioFinal = this.salarioMensual;

			if (!sueldoValido(cargo, salarioFinal)) {
				if (salarioFinal < 3000) {
					salarioFinal = 3001;
				} else {
					salarioFinal = 4999;
				}
			}

		} else if (cargo.equals("Senior")) {
			salarioFinal = this.salarioMensual - (this.salarioMensual * 0.05);

			if (!sueldoValido(cargo, salarioFinal)) {
				salarioFinal = 2700;
			}

		} else if (cargo.equals("Mid")) {
			salarioFinal = this.salarioMensual - (this.salarioMensual * 0.10);

			if (!sueldoValido(cargo, salarioFinal)) {
				salarioFinal = 1800;
			}

		} else {
			salarioFinal = this.salarioMensual - (this.salarioMensual * 0.15);

			if (!sueldoValido(cargo, salarioFinal)) {
				salarioFinal = 0;
			}
		}

		return salarioFinal;

	}

	protected boolean sueldoValido(String cargo, double salarioFinal) {

		if (cargo.equals("Boss")) {
			if (salarioFinal > 8000) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Manager")) {
			if (salarioFinal > 3000 && salarioFinal < 5000) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Senior")) {
			if (salarioFinal > 2700 && salarioFinal < 4000) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Mid")) {
			if (salarioFinal > 1800 && salarioFinal < 2500) {
				return true;
			} else {
				return false;
			}

		} else if (cargo.equals("Junior")) {
			if (salarioFinal > 900 && salarioFinal < 1600) {
				return true;
			} else {
				return false;
			}

		} else {
			if (salarioFinal == 0) {
				return true;
			} else {
				return false;
			}
		}

	}

}