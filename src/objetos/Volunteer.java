package objetos;

public class Volunteer extends Empleado {

	//DECLARAR CONSTANTE
	final String CATEGORIAPROF = "Volunteer";
	
	//DEFINIR ATRIBUTO
	String categoriaProf = CATEGORIAPROF;

	//CREAR CONSTRUCTOR
	public Volunteer(String nombreEmpleado) {
		super(nombreEmpleado);
	}
	
}
