package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugg {

	public static void main(String[] args)throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		
		// This is Auto Suggession Program 
//		
//		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("seleni");
//		
//		List<WebElement> Auto = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
//		
//		
//		for(WebElement a :Auto )
//		{
//			System.out.println(a.getText());
//		}
//		
//	
//		
//		
//		for(int i=0;i<Auto.size();i++)
//		{
//		if(Auto.get(i).getText().equals("Selena Gomez"));
//		{
//			Auto.get(i).click();
//			break ;
//		}
//		
//		}        
//Thread.sleep(5000);
//		//Selena Gomez
//
//		
//		
//		driver.close();
		
		
		// Auto link 
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		
//		
//		for(WebElement xyz : allLinks)
//		{
//			System.out.println(xyz.getText());
//		}
//		
		

		for(WebElement xyz : allLinks)
			
			if(xyz.getText().equals("About"))
		{

             xyz.click();
             break;
		}
		
		List<WebElement> all = driver.findElements(By.xpath("//a"));
		
		
		for(WebElement H : all)
		{
			System.out.println(H.getText());
		}
		
		
	
		
		
	Thread.sleep(2000);
		
driver.close();
	}

}
