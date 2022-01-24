package main;

import objetos.*;


public class MainAPP {

	public static void main(String[] args) {
		
		Volunteer m1 = new Volunteer("Raul", 1500);
		
		System.out.println(m1);
		
		m1.salarioFinal();
		
		System.out.println(m1);

	}

}
