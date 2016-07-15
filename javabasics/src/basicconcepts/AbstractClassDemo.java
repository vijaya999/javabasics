package basicconcepts;

public class AbstractClassDemo extends AbstractClass {
	@Override
	public void method2(){
		System.out.println("This is method 2 defined in Absract class Demo");
	}
	
	@Override
	public void method3(){
		System.out.println("This is method 3 defined in Abstract class demo");
	}
	
	public static void main(String[] args) {
		AbstractClassDemo acdemo = new AbstractClassDemo();
		AbstractClassDemo1 acdemo1 = new AbstractClassDemo1();
		acdemo.method1();
		acdemo.method2();
		acdemo.method3();
		acdemo1.method1();
		acdemo1.method2();
		acdemo1.method3();
	}
}
