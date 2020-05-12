package gNumericTypes;

import libs.Input;

public class EjemploFloat {

	public static void main(String[] args) {
		System.out.print("número fraccional 1: "); // funcion para imprimir en consola
		float f = Input.get_float();

		System.out.print("número fraccional 2 "); // funcion para imprimir en consola
		float f2 = Input.get_float();
		
		Input.print("numFraccional1/numFraccional2 = " + (f/f2));

	}

}
