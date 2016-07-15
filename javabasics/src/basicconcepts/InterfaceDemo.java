package basicconcepts;

public class InterfaceDemo implements sampleInterface, SampleInterface1{

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println(empName);
		System.out.println("addtion from Interface demo");
	}

	@Override
	public void subtraction() {
		// TODO Auto-generated method stub
		System.out.println("subtract method from Interface demo");
	}

	public static void main(String[] args) {
		InterfaceDemo iObj = new InterfaceDemo();
		iObj.addition();
		iObj.subtraction();
		iObj.division();
		iObj.multiplication();
	}

	@Override
	public void division() {
		// TODO Auto-generated method stub
//		System.out.println("division method from Inteface demo class");
	}

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		System.out.println("multiplication from Interface demo class");
	}
}
