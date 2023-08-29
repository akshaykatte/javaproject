package DateProg;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		
		WebElement cal = driver.findElement(By.xpath("//img[@src='http://jqueryui.com/resources/demos/datepicker/images/calendar.gif']"));
		
		cal.click();
		
		while(true)
		{
			
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(month.equals("May") && year.equals("2028"))
				
			{
				
				
				java.util.List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td"));
				
				for(WebElement H :allDate)
				{
					String K= H.getText();
					
					if(K.equals("16"))
					{
						H.click();
						break;
					}
				}
				break ;
				
				
				
			}
			else
			{
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			
			
			
		}
		
		
driver.close();

	}

}
