package sikuli;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileAttach {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://google.com");
	    driver.manage().window().maximize();
	    Screen s=new Screen();
	    Pattern gmaillink=new Pattern(".//sikuli images//gmailLink.png");
	    //Pattern signin=new Pattern(".//sikuli images//Signin.png");
	    Pattern emailid=new Pattern(".//sikuli images//emailID.png");
	    Pattern nextbutn=new Pattern(".//sikuli images//nextButton.png");
	    Pattern password=new Pattern(".//sikuli images//password.png");
	    Pattern loginbtn=new Pattern(".//sikuli images//Login.png");
	    Pattern compose=new Pattern(".//sikuli images//compose.png");
	    Pattern to=new Pattern(".//sikuli images//tomail.png");
	    Pattern subject=new Pattern(".//sikuli images//subject.png");
	    //Pattern body=new Pattern(".//sikuli images//bodymail.png");
	    Pattern attach=new Pattern(".//sikuli images//attach.png");
	    s.find(gmaillink);
		s.click(gmaillink);
		//s.click(signin);
		s.wait(emailid,5000);
		s.type(emailid, "vijji.kurra");
		s.find(nextbutn).click();
		s.type(password, "mahalakshmi5chinni");
		s.find(loginbtn).click();
		s.wait(compose,5000);
		s.find(compose).click();
		s.wait(to,5000);
		s.type(to, "vijaya999.k@gmail.com");
		s.wait(subject,3000);
		s.type(subject, "resume");
		//s.wait(body,5000);
		//s.type(body, "hi");
		s.wait(attach,5000);
		s.find(attach).click();
		Pattern folderPath = new Pattern(".//sikuli images//folderpath.png");
		Pattern fileName = new Pattern(".//sikuli images//filename.png");
		Pattern openButton = new Pattern(".//sikuli images//openButton.png");
		Pattern sendbtn = new Pattern(".//sikuli images//send.png");
		Pattern myimage = new Pattern(".//sikuli images//myimage.png");
		Pattern signout = new Pattern(".//sikuli images//signout.png");
		s.wait(folderPath,5000);
		s.find(folderPath);
		s.click();
		s.type("C:\\Users\\Sadguna Rao Kurra\\Desktop\\Resumes");
		s.type(Key.ENTER);
		s.find(fileName).click();
		s.type(fileName,"supriya Resume.docx");
		s.find(openButton).click();
		//s.wait(sendbtn,10000);
		Thread.sleep(8000);
		s.find(sendbtn).click();
		Thread.sleep(8000);
		s.find(myimage).click();
		s.find(signout).click();
	    

	}

}
