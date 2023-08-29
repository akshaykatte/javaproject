package DateProg;



import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog3 {

	public static void main(String[] args) throws Exception {
                    WebDriverManager.chromedriver().setup();
                    
                    WebDriver driver = new ChromeDriver();
                    driver.manage().window().maximize();
                    
                    
                    driver.get("https://demo.automationtesting.in/Datepicker.html");
                  WebElement cal = driver.findElement(By.xpath("//input[@id='datepicker2']"));
                  cal.click();
                    
                  WebElement month = driver.findElement(By.xpath("//select[@title='Change the month']"));
                
                  
                  Select m = new Select(month);
                  m.selectByVisibleText("May");
                  
                  Thread.sleep(2000);
                  WebElement year = driver.findElement(By.xpath("//select[@title='Change the year']"));
                  Select y = new Select(year);
                   y.selectByVisibleText("2028");
                   
                   Thread.sleep(2000);
               List<WebElement> date = driver.findElements(By.xpath("//div[@class='datepick-month']//table//td"));
                 
               
                 for(WebElement A :date)
                 {
                	 String V = A.getText();
                	 {
                		 if(V.equals("16"))
                		 {
                			 A.click();
                			 break;
                		 }
                	 }
                 }
                 
                 Thread.sleep(5000);

         File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         
         File dest = new File("C:\\Users\\91899\\eclipse-workspace\\JavaProg\\Screenshots/photo1.jpeg");
         
         FileHandler.copy(source, dest);
                 
                 

          
driver.close();
	}

}
