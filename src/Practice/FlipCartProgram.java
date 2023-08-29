package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipCartProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("mobile");
		
		
		List<WebElement> autoSugess = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']//li"));
		
		for(int i=0;i<autoSugess.size();i++)                             //ul[@class='col-12-12 _1MRYA1']//li
		{
			System.out.println(autoSugess.get(i).getText());
		}
		
		
		driver.close();

	}

}
