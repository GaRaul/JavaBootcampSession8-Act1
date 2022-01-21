package main;

import objetos.*;

public class MainApp {

	public static void main(String[] args) {

		Senior s1 = new Senior("Fernando", 2400);
		Junior j1 = new Junior("Raul", 3100);
		Volunteer v1 = new Volunteer("Abel", 0);

		// Aplicamos reduccion de sueldo
		s1.salarioMensualBruto();
		j1.salarioMensualBruto();
		v1.aplicarSubvencion(300);
		
		System.out.println("El sueldo mensual bruto de " + s1.getNombre() + " es: " + s1.getSalarioMensualBruto());
		System.out.println("El sueldo mensual bruto de " + j1.getNombre() + " es: " + j1.getSalarioMensualBruto());
		System.out.println("La subvencion de " + v1.getNombre() + " es: " + v1.getSubvencion());
		System.out.println();
		
		// Calculamos el salario neto
		s1.salarioMensualNeto();
		j1.salarioMensualNeto();
		
		System.out.println("El sueldo mensual neto de " + s1.getNombre() + " es: " + s1.getSalarioMensualNeto());
		System.out.println("El sueldo mensual neto de " + j1.getNombre() + " es: " + j1.getSalarioMensualNeto());
		System.out.println();
		
		// Calculamos el sueldo anual bruto
		s1.calcularSueldoAnualBruto();
		j1.calcularSueldoAnualBruto();
		
		System.out.println("El sueldo anual bruto de " + s1.getNombre() + " es: " + s1.getSalarioAnualBruto());
		System.out.println("El sueldo anual bruto de " + j1.getNombre() + " es: " + j1.getSalarioAnualBruto());
		System.out.println();
		
		// Calculamos el sueldo anual neto
		s1.calcularSueldoAnualNeto();
		j1.calcularSueldoAnualNeto();
		
		System.out.println("El sueldo anual neto de " + s1.getNombre() + " es: " + s1.getSalarioAnualNeto());
		System.out.println("El sueldo anual neto de " + j1.getNombre() + " es: " + j1.getSalarioAnualNeto());
		System.out.println();
		
		// Aplicamos el bonus del 10% a los sueldos anuales brutos y recalculamos el sueldo anual neto
		s1.bonus();
		j1.bonus();
		
		System.out.println("El sueldo anual bruto + BONUS de " + s1.getNombre() + " es: " + s1.getSalarioAnualBruto());
		System.out.println("El sueldo anual bruto + BONUS de " + j1.getNombre() + " es: " + j1.getSalarioAnualBruto());
		System.out.println();
		System.out.println("El sueldo anual neto + BONUS de " + s1.getNombre() + " es: " + s1.getSalarioAnualNeto());
		System.out.println("El sueldo anual neto + BONUS de " + j1.getNombre() + " es: " + j1.getSalarioAnualNeto());
		
	}

}
