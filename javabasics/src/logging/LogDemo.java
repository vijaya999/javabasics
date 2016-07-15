package logging;



import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LogDemo {
	//static WebDriver driver;
	static Logger logger;
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		logger = Logger.getLogger(LogDemo.class.getName());
		
		//driver = new FirefoxDriver();
		logger.debug("firefox driver object created");
		//System.out.println("firefox driver object created");
		//driver.get("http://google.com");
		logger.info("navigate to ");
	    // System.out.println("driver navigated to "+driver.getCurrentUrl());
		//driver.manage().window().maximize();
		logger.debug("browser window maximized");
		//System.out.println("browser window maximized");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
	}
}
