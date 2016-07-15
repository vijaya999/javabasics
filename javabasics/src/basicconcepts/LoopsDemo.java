package basicconcepts;

public class LoopsDemo {

	public static void main(String[] args) {
		// while loop
		/*
		 * to repeat the execution of block of statements while(boolean
		 * expression){ statements }
		 */
		System.out.println("while Loop with break statement");
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
//			System.out.println("\n");
			i++;
			if(i==5){
				break;
			}
		}
		System.out.println("\n");
		// do...while
		/*
		 * do{ 
		 * 	statements; 
		 * }while(condition)
		 */
		System.out.println("do while Loop");
		int j =0;
		do{
			System.out.print(j+ " ");
			j++;
		}while(j<10);
		
		System.out.println("\n");
		// for loop
		/*
		 * for(initialization; condition; update){ statement; }
		 */
		System.out.println("For Loop");
		for(int l=0; l<10; l++){
			System.out.print(l+" ");
		}
		
		System.out.println("\n");
		int[] ar = {1,2,3,4,5,6,7,8,9,0};
		String[] a = {"selenium","manual","qtp","cucumber","load runner","appium"};
		
		for(int x=0; x<a.length;x++){
			if(a[x].equals("qtp")){
				System.out.println("qtp course is available");
			}
		}
		// for each loop(enhanced for loop)
		/*
		 * for(declaration:object){ 
		 * statement; 
		 * }
		 */
		System.out.println("foreach Loop");
		for(String x: a){
			if(x.equals("appium")){
				System.out.println("appium course is available");
			}
//			System.out.print(x+" ");
		}

	}
}
