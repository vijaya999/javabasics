package logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XMLFileDemo {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(PropertyFileDemo.class);
		DOMConfigurator.configure("log4j.xml");
		//WebDriver driver = new FirefoxDriver();
		log.info("Firefox browser launched succesfully");
		//driver.get("http://google.com");
		//log.debug("driver navigated to "+driver.getCurrentUrl());
		log.info("second message3");
		log.error("third message3");
		
	}
}
