package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jshell.Diag;

public class HAndleMultiProg {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://portal1.passportindia.gov.in/AppOnlineProject/online/apptAvailStatus']")).click();
		Set<String> windows = driver.getWindowHandles();
		
		
		Iterator<String> a = windows.iterator();
		
	String parent = a.next();
	System.out.println(parent);
	String child =  a.next();
	System.out.println(child);
	
		
		driver.close();
		
		driver.switchTo().window(child);
		driver.close();
		
		
	}

}
