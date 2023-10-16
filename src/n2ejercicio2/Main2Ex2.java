package n2ejercicio2;

import n1ejercicio2.GenericMethods;
import n1ejercicio2.Persona;

public class Main2Ex2 {

	public static void main(String[] args) {

		Persona persona = new Persona("Calixto", "Benavente", 35);
		String string = "Hola";
		int num = 33;

		GenericMethods.printAttributes(persona, string, num);
		System.out.println("");
		GenericMethods.printAttributes(string, num, persona);
		System.out.println("");
		GenericMethods.printAttributes(num, persona, string);
		System.out.println("");

	}

}
