package basicconcepts;

public class AcessModifiersDemo {
	
	/*
	 * To hide the data
	 * To define the scope 
	 * 
	 * default: use with in the package
	 * public: use anywhere in java world
	 * private: use with in the class
	 * protected: use with in the package, with in the sub classes  of main class only only
	 * 
	 */

	private static String name;
	
	protected static String address;
	
	public static void setName(String n){
		name = n;
	}
	
	public static String getName(){
		return name;
	}
	
	/**
	 * This is an addition method which will accept 
	 * two integer values a and b and it will return
	 * addition of a and b in an integer
	 * 
	 */
	
	public static int addition(int a, int b){
		return a+b;
	}
	
	/**
	 * This is an addition method which will accept 
	 * two Strings values a and b and it will return
	 * combined string of a and b in an integer
	 * 
	 */
	public static String addition(String a, String b){
		String result = a+b;
		return result;
	}
	
	public static void print(){
		System.out.println("parent class");
	}
	
	public static void main(String[] args) {
		AccessModifiers a = new AccessModifiers("selenium");
		System.out.println(a.value);
//		AcessModifiersDemo demo = new AcessModifiersDemo();
//		demo.setName("surya");
//		int c = addition(10, 20);
//		System.out.println(c);
//		
//		String r = addition("Selenium", "automation");
//		System.out.println(r);
	}
}
