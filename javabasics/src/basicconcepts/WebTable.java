package basicconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
	static WebDriver driver;
	public static void launchApp(){
		driver = new FirefoxDriver();
		driver.get("http://www.bseindia.com/markets/Equity/EuqityDB.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void windowHandle() throws InterruptedException{
		ArrayList<String> wh = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(wh.get(1));
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath(".//*[@id='divStremer']/table/tbody/tr/td[1]")).getText();
		System.out.println(text);
		driver.close();
		driver.switchTo().window(wh.get(0));
		System.out.println(driver.getCurrentUrl());
	}
	
	public static void webTable(By tableLoc, String securityCode) throws InterruptedException{
		boolean flag = true;
		WebElement table = driver.findElement(tableLoc);
		//find no of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		for(WebElement eachrow: rows){
			//find no of columns
			List<WebElement> columns = eachrow.findElements(By.tagName("td"));
			for(WebElement cell: columns){
				if(cell.getText().equalsIgnoreCase(securityCode)){
//					System.out.println(columns.get(2).getText());
			columns.get(1).findElement(By.tagName("a")).click();
					windowHandle();
					flag = false;
					break;//columns
				}
			}
			if(flag==false){
				break;//rows
			} 
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		launchApp();
		webTable(By.xpath("(.//*[@id='form1']//table)[last()]/tbody"), "500875");
	}
}
