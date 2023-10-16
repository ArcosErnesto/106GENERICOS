package n2ejercicio2;

public class GenericMethodsN2E2 {
	public static <T> void printAttributes(T... attributes) {
		for (T attribute : attributes) {
			System.out.println(attribute);
		}
	}
}
