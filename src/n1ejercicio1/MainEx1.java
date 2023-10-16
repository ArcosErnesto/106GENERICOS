package n1ejercicio1;

public class MainEx1 {

	public static void main(String[] args) {

		String string1 = "String1";
		String String2 = "String2";
		String String3 = "String3";

		NoGenericMethods<String> generic1 = new NoGenericMethods<String>(string1, String2, String3);
		NoGenericMethods<String> generic2 = new NoGenericMethods<String>(String2, String3, string1);
		NoGenericMethods<String> generic3 = new NoGenericMethods<String>(String3, string1, String2);

		System.out.println("generic1:");
		System.out.println(generic1.getAttribute1());
		System.out.println(generic1.getAttribute2());
		System.out.println(generic1.getAttribute3());
		System.out.println("");

		System.out.println("generic2:");
		System.out.println(generic2.getAttribute1());
		System.out.println(generic2.getAttribute2());
		System.out.println(generic2.getAttribute3());
		System.out.println("");

		System.out.println("generic3:");
		System.out.println(generic3.getAttribute1());
		System.out.println(generic3.getAttribute2());
		System.out.println(generic3.getAttribute3());
		System.out.println("");

	}

}
