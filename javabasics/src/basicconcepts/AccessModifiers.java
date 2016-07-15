package basicconcepts;

public class AccessModifiers extends AcessModifiersDemo{
	public String value;
	
	/*
	 * extends is the keyword used for inheritance
	 * AcessModifiersDemo is the parent class
	 * AcessModifiers is the child class
	 * 
	 */
	public static String addition(String x, String y){
		String result = "Combined statement of "+x+" "+y;
		return result;
	}
	
	public static void print(){
		System.out.println("this is child class");
	}
	//defulat constructor
	public AccessModifiers(){
		this.print();
		value = "intialization of value in constructor call";
		
	}
	
	//parameterized constructor
	public AccessModifiers(String value){
		this.value =value;
	}
	
	public static void main(String[] args) {
		AccessModifiers dcObj = new AccessModifiers(); 
		System.out.println(dcObj.value);
		AccessModifiers a = new AccessModifiers("Automation Training center");
		System.out.println(a.value);
//		address = "madhura nagar";
////		setName("surya");
////		System.out.println(" name is: "+getName());
////		System.out.println(" address is: "+address);
//		System.out.println(addition("selenium", "automation"));
	}
 
}
