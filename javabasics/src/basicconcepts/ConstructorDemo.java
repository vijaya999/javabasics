package basicconcepts;

public class ConstructorDemo extends ConstructorClass {
	
	public String name;
	
	public ConstructorDemo(){
		System.out.println("child class constructor");
		super.name = "QTP";
	}
	
	public ConstructorDemo(String name){
		super(name);
	}
	
	public static void main(String[] args) {
		ConstructorDemo cdObj = new ConstructorDemo();
		ConstructorDemo cdpObj = new ConstructorDemo("child class parameter constructor");
		System.out.println(cdpObj.name);
	}
}
