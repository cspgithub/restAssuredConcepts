package restassuredbyCSPexamples;

public class StaticConcept {
	// Static variable
	public static String name = "Selenium";

	// Non static variable
	public int version = 3;

	// Static method
	public static void printName() {
		System.out.println("Name is :" + name);
	}

	// Non static method
	public void printVersion() {
		System.out.println("Version is : " + version);
	}

}
