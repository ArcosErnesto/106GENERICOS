package n1ejercicio2;

public class GenericMethods<T> {

	public static <T, U, V> void printAttributes(T arg1, U arg2, V arg3) {
		System.out.println("Attribute 1: " + arg1);
		System.out.println("Attribute 2: " + arg2);
		System.out.println("Attribute 3: " + arg3);

	}

}
