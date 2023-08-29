package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleBrowser {

	public static void main(String[] args) {
		WebDriver driver ;
		String browser = "edge";
		
		if(browser=="Chrome")
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.close();
			
		}
		
		else if (browser=="FireFox")
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.close();
		}
		
		else
			if(browser =="edge")
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.close();
		}
			
		
		
		
		
		
		
		
		
	

	}

}
