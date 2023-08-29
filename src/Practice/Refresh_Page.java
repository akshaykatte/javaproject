package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Refresh_Page {

	public static void main(String[] args) throws Exception {
	
		
     WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().to("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
		driver.navigate().to("https://majhinaukari.online/");
		driver.navigate().back();		Thread.sleep(2000);

		driver.navigate().forward();		Thread.sleep(2000);

		driver.navigate().refresh();

		driver.close();
		
		

	}

}
