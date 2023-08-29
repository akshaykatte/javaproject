package DateProg;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
	//Open The Url
		
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
    // click the calender
		
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		// use while loop
		while(true)
		{
			// get the text of year and month which is present on calender
			String MonthPic = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			String YearPic = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			// comaprare the month and year with specific year and month
			
			if(MonthPic.equals("May") && YearPic.equals("2040"))
			{
				
		// get the all Element present on calender 
				
				List<WebElement>allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
				
		// use for each loop for getting all element
				
				for(WebElement H:allDate)
				{
					String K = H.getText();
					
					
					// compare date
					
					
					if(K.equals("16"))
					{
						H.click();
						break;
					}
					
				}
				
				// if matching all element with expected date month year then break while loop
				
				break;
	        
				
			}
			
			// here if month is not mathing then click on next icon 
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
			
		}
		
		
		
		
	driver.close();	
	
	}

}
