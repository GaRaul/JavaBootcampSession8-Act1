package objetos;

public class Boss extends Empleado {

	//DECLARAR CONSTANTE
	final String CATEGORIAPROF = "Boss";
	
	//DEFINIR ATRIBUTO
	String categoriaProf = CATEGORIAPROF;

	//CREAR CONSTRUCTOR
	public Boss(String nombreEmpleado, double salarioMensual) {
		super(nombreEmpleado, salarioMensual * 1.5);
	}
	
//	private void salarioFinal() {
//		
//		this.salarioMensual = this.salarioMensual * 1.10;
//		
//	}
}
