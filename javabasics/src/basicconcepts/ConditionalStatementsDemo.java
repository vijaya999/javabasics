package basicconcepts;

public class ConditionalStatementsDemo {
	public static void main(String[] args) {
		//if statement
		/*
		 * if(Boolean Expression){
		 *		statements;
		 * }
		 */
		String str1 = "sample";
		String str2 ="sample";
		String str3 = "Sample";
		if(true){
			System.out.println("if statement with true boolean value");
		}
		
		if(3>2){
			System.out.println("if statement with 3>2");
		}
		
		if(str1.equals(str2)){
			System.out.println(str1 +"is equal to "+str2);
		}
		
		
		
		//if...else statement
		/*
		 * if(boolean expression){
		 *  		statements; //if boolean expression is true
		 *  }else{
		 *  		statements; //if boolean expression is false
		 *  }
		 */
		
		if(str1.equals(str3)){
			System.out.println(str1 +" is equal to "+str3);
		}else{
			System.out.println(str1 +" is not equal to " + str3);
		}
		
		if (str1.equals(str2)) {
			System.out.println(str1 + " is equal to "+str2);
		} else {
			System.out.println(str1 + " is not equal to "+str2);
		}
		
		//if..else if...else
		/*
		 * if(boolean expression1){
		 * 		statements; //will execute if boolean expression 1 is true
		 * }else if(boolean expression 2){
		 * 		Statements;//will execute if boolean expression 1 is false and expression 2 is true
		 * }else{
		 * 		statements;//will execute if boolean expressions 1 and 2 are false
		 * }
		 */
		
		if(str1.equals(str3)){
			System.out.println(str1 + " is equal to "+str3);
		}else if(str1.equalsIgnoreCase(str3)){
			System.out.println(str1 + " is equal to "+str3);
		}else{
			System.out.println(str1 + "is not equal to "+str3);
		}
		
		
		//nested if
		/*
		 * if(boolean expression1){
		 * 		statements; //will execute when boolean expression 1 is true
		 * 		if(boolean expression2){
		 * 			statements;//will execute only when boolean expressions 1 and 2 are true
		 * 	}
		 * }else{
		 * 	statements;//will execute only when expression 1 is false
		 * }
		 * 
		 * if(boolean expression1 && boolean expression 2){
		 * 		statements;//will execute only when boolean expressions 1 and 2 are true
		 * }
		 * else{
		 * 		statements;//will execute only when either expression 1 or expression 2 are false
		 * }
		 * 
		 */
		
		
		//switch statement
		/*
		 * switch(condition){
		 * case value:
		 * 		statements;
		 * 		break;
		 * case value:
		 * 		stetements;
		 * 		break;
		 * default: //optional
		 * 		statements;
		 */
		
		String typeOfLoc = "linktext";
		switch (typeOfLoc) {
		case "id":
			System.out.println("locating using id: "+typeOfLoc);
			break;
		case "name":
			System.out.println("locating using name: "+typeOfLoc);
			break;
		case "xpath":
			System.out.println("locating using xpath: "+typeOfLoc);
			break;
		case "cssslector":
			System.out.println("locating using css: "+typeOfLoc);
			break;
		case "linktext":
			System.out.println("locating using linktext: "+typeOfLoc);
			break;
		case "partiallinktext":
			System.out.println("locating using partiallinktext: "+typeOfLoc);
			break;
		case "classname":
			System.out.println("locating using classname: "+typeOfLoc);
			break;
		case "tagname":
			System.out.println("locating using tagnaem: "+typeOfLoc);
			break;
		default:
			System.out.println("please enter a value which is in between 1 - 7");
			break;
		}
		
	}
}
