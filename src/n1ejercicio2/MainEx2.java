package n1ejercicio2;

public class MainEx2 {

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
