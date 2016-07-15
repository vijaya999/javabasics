package basicconcepts;

public abstract class AbstractClass {

	public String value = "This is non final variable";
	
	public void method1(){
		System.out.println("THis is method 1 is defined in abstract class");
	}
	
	public abstract void method2();
	public abstract void method3();
}
