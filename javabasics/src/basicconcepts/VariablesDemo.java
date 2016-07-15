package basicconcepts;

public class VariablesDemo {
	/**
	 * byte datatype
	 * Range is -127 to 128
	 * This data type is declared in variable demo class
	 */
	
	public static Byte byteVar = 125;
	
	/**
	 * short datatype
	 * Range is -2^15 to 2^15
	 */
	
	static Short shortVar = 12345;
	
	public void methodOne(){
		byteVar =126;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("The byte value is: "+byteVar);
		
		
		System.out.println("The short value is: "+shortVar);
		
		int intVar = 1234567;
		System.out.println("The int value is: "+intVar);
		
		Double doubleVar = 12.234;
		System.out.println("The double value is: "+doubleVar);
		
		Boolean bVar = true;
		System.out.println("The boolean value is: "+bVar);
	}	
	
}
