package basicconcepts;

public class ConstructorClass {

	public String name;
	
	//default constructor
	public ConstructorClass(){
		System.out.println("parenet class constructor");
		name="selenium";
	}
	
	//parameterized constructor
	public ConstructorClass(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		ConstructorClass dObj = new ConstructorClass();
		System.out.println(dObj.name);
		
		ConstructorClass pObj = new ConstructorClass("parent class parameter constructor");
		System.out.println(pObj.name);
	}
	

}
