package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://pdf2doc.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@id='pick-files']//span[2]")).click();
		try {
			Screen s = new Screen();
			Pattern folderPath = new Pattern(".//sikuli images//folderpath.png");
			Pattern fileName = new Pattern(".//sikuli images//filename.png");
			Pattern openButton = new Pattern(".//sikuli images//openButton.png");
			s.wait(folderPath,5000);
			s.find(folderPath);
			s.click();
			s.type("F:\\vijaya_labfiles\\VSS\\Kvijaya\\DEFFECTS IN BANKER MODULE");
			s.type(Key.ENTER);
			s.find(fileName).click();
			s.type("Resume_Harish_Kasarla_RPT_14-05-23.pdf");
			s.find(openButton).click();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	

}
