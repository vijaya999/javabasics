package basicconcepts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.util.Properties;

public class PropertiesClass {
	static FileInputStream fis;
	static File f;
	public static void main(String[] args) {
		try {
			 f = new File(".//src//basicconcepts//data.properties");
			fis = new FileInputStream(".//src//basicconcepts//data.properties");
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println("name is: "+prop.getProperty("name"));
			System.out.println("course is: "+prop.getProperty("course"));
		} catch (Exception e) {
//			if(f.exists()){
//				
//			}
		}
	}

}
