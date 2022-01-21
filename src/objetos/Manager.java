package objetos;

public class Manager extends Empleado {

	//DECLARAR CONSTANTE
	final String CATEGORIAPROF = "Manager";
	
	//DEFINIR ATRIBUTO
	String categoriaProf = CATEGORIAPROF;

	//CREAR CONSTRUCTOR
	public Manager(String nombreEmpleado, double salarioMensual) {
		super(nombreEmpleado, salarioMensual * 1.10);
	}
	
//	private void salarioFinal() {
//		
//		this.salarioMensual = this.salarioMensual * 1.10;
//		
//	}
}
