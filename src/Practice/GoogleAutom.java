package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutom {

	public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--headless");
	
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("Akshay");
	
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//textarea[@title='Search']")).click();
//	Thread.sleep(5000);
     
    List<WebElement> autosugg = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
	
	for(int i=0;i<autosugg.size();i++)
	{
		System.out.println(autosugg.get(i).getText());
	}
	
	// it will be click elements without using xpath
	for(int i=0;i<autosugg.size();i++)
	{
		if(autosugg.get(i).getText().equals("akshay kumar wife"))
		{
			autosugg.get(i).click();
			break;
		}
	}
//	
//	 WebElement image = driver.findElement(By.xpath("//a[normalize-space()='Images']"));
//	image.click();
//	Thread.sleep(5000);
//	
//	
//	JavascriptExecutor js = (JavascriptExecutor)driver ;
//	
//	js.executeScript("window.scrollBy(0,1500)");
//	Thread.sleep(5000);
//   driver.close();
//		
//		
		
		
	}

}
