
package basicconcepts;

public class StringDemo {

	public static void main(String[] args) {
		String str1 = "This is the actual test String.";

		String str2 = "               trim String              ";

		String str3 = "";

		// length of string
		System.out.println(str1.length());
		char[] chars = str1.toCharArray();
		System.out.println("length is: " + chars.length);
		String s = str1.concat("@");
		System.out.println(s);
		System.out.println(s.indexOf("@"));

		// Reverse of the String
		for (int i = chars.length - 1; i >= 0; i--) {
			System.out.print(chars[i]);
		}

		// //charAt
		// System.out.println(str1.charAt(8));
		//
		// //concat
		// System.out.println(str1.concat("This is appended string"));
		//
		// //contains
		// System.out.println(str1.contains("test"));
		//
		// //startswith
		// System.out.println(str1.startsWith("this"));
		//
		// //endswith
		// System.out.println(str1.endsWith("String."));
		//
		// //equals
		// System.out.println(str1.equals("This is the actual Test String."));
		// System.out.println(str1.equalsIgnoreCase("This is the actual test
		// string."));
		//
		// //indexof
		//
		System.out.println(str1.indexOf("t"));
		//

		// //isempty
		// System.out.println(str1.isEmpty());
		//
		// //replace
		// System.out.println(str1.replace('t', 'T'));
		// System.out.println(str1.replace("This", "It"));
		//
		// //substring
		// System.out.println(str1.substring(5));
		// System.out.println(str1.substring(0, 4));
		//
		//
		// //tolowercase
		// System.out.println(str1.toLowerCase());
		// //toUpperCase
		// System.out.println(str1.toUpperCase());
		// //trim
		// System.out.println(str2.trim());
		// //split
		// String[] strngs = str1.split(" ");
		// for(int i=0; i<strngs.length;i++){
		// System.out.println(strngs[i]);
		//
	}
}
