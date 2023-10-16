package n2ejercicio1;

import n1ejercicio2.Persona;

public class Main2ex1 {

	public static void main(String[] args) {

		Persona persona = new Persona("Calixto", "Benavente", 35);
		String string = "Hola";
		int num = 33;

		GenericMethodsN2E1.printAttributes(persona, string, num);
		System.out.println("");
		GenericMethodsN2E1.printAttributes(string, persona, num);
		System.out.println("");

	}

}
