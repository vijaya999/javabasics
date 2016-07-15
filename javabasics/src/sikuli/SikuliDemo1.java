
package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliDemo1 {
	public static void main(String[] args) {
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://google.com");
//		driver.manage().window().maximize();
		try {
			Screen s = new Screen();
			Pattern gmailLink = new Pattern(".//sikuli images//gmailLink.png");
			Pattern emailId = new Pattern(".//sikuli images//emailID.png");
			Pattern nextButton = new Pattern(".//sikuli images//nextButton.png");
			Pattern windowButton = new Pattern(".//sikuli images//windowsButton.png");
			Pattern powerButton = new Pattern(".//sikuli images//powerButton.png");
			Pattern folder = new Pattern(".//sikuli images//folder.png");
			Pattern closefolder = new Pattern(".//sikuli images//closefolder.png");
			Pattern screenShotwindow = new Pattern("C://Users//Sadguna Rao Kurra//Pictures//Screenshots//Screenshot.png");
			Pattern newfolder = new Pattern(".//sikuli images//newfolder.png");
			Pattern sampletext = new Pattern(".//sikuli images//sampletext.png");
//			s.find(gmailLink);
//			s.click(gmailLink);
//			s.wait(emailId,5000);
//			s.type(emailId, "suryaprathipati");
//			s.find(nextButton).click();
//			driver.close();
//			s.find(windowButton).click();
//			s.find(powerButton).click();
//			s.find(windowButton).click();
////			s.rightClick(folder);
//			s.find(closefolder).click();
			s.find(".//sikuli images//minimize.png").click();
			s.find(powerButton).click();
			s.find(newfolder);
			
			s.dragDrop(sampletext, newfolder);
		
			
			
			
			
			
		} catch (Exception e) {

		}
	}
}
