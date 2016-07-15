package basicconcepts;

public class ArraysDemo {
	public static void main(String[] args) {
		/*
		 * Array is sequential collection similar data 
		 * 
		 * Array declaration
		 * dataType[] arrayRefVarName;
		 * dataType arrayRefVarName[]; 
		 * 
		 * defining an array
		 * dataType[] arrayRefVarName = new dataType[5];
		 * 
		 * Initialize an array
		 * dataType[] arrayRefVarName ={values of dataType}; 
		 */
		AcessModifiersDemo amd1 = new AcessModifiersDemo();
		amd1.setName("surya");
		
		int[] data = {1,2,3,4,5,6,7};
		System.out.println(data.length);
		
		int[] nums;
		nums = new int[5];
		
		for(int num:nums){
			System.out.println(num);
		}
		
		String[] names = new String[5];
		System.out.println(names.length);
		names[0] = "surya";
		names[1] = "prakash";
		for(String name:names){
			System.out.println(name);
		}
		
		
		//object arrays
		
		Object[] objs = {"surya",26,"adresss", 987654123, 23543.99};
		for(Object obj : objs){
			System.out.println(obj);
		}
		
	}

}
