package objetos;

public class Employee extends Empleado {

	//DECLARAR CONSTANTE
	final String CATEGORIAPROF = "Employee";
	
	//DEFINIR ATRIBUTO
	String categoriaProf = CATEGORIAPROF;

	//CREAR CONSTRUCTOR
	public Employee(String nombreEmpleado, double salarioMensual) {
		super(nombreEmpleado, salarioMensual - (salarioMensual * 0.15));
	}
	
//	private void salarioFinal() {
//		
//		this.salarioMensual = this.salarioMensual * 1.5;
//		
//	}
}
