package Select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auto_Suggession {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selen");


		List<WebElement> e = driver.findElements(By.xpath("//ul[@role='listbox']//li"));


//		for(int i=0;i<e.size();i++)
//		{
//			System.out.println(e.get(i).getText());
//
//		}

		    for(int i=0;i<e.size();i++)
		    	if(e.get(i).getText().equals("selenophile meaning"))
		    	{
		    		e.get(i).click();
		    		break;
		    	}


	}

}
