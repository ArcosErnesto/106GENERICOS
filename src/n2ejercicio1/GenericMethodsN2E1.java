package n2ejercicio1;

public class GenericMethodsN2E1<T> {
	public static <T, U> void printAttributes(T arg1, U arg2, int arg3) {
		System.out.println("Attribute 1: " + arg1);
		System.out.println("Attribute 2: " + arg2);
		System.out.println("Attribute 3: " + arg3);

	}
}
