package logging;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyFileDemo {
	public static void main(String[] args) {
		Logger log = Logger.getLogger(PropertyFileDemo.class);
		PropertyConfigurator.configure("log4j.properties");
		WebDriver driver = new FirefoxDriver();
		log.info("Firefox browser launched succesfully..1");
		driver.get("http://google.com");
		log.debug("driver navigated to "+driver.getCurrentUrl());
		log.info("second message...1");
		log.error("third message..456");
		
	}
}
