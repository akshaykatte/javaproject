package Practice;

import java.util.List;
//https://www.softwaretestingmaterial.com/sample-webpage-to-automate/
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");		


driver.switchTo().frame("iframeResult");


WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));


//Select s = new Select(dropdown);
//System.out.println(s.isMultiple());
// 
//Thread.sleep(2000);
// s.selectByVisibleText("Volvo");
// Thread.sleep(2000);
//
// s.selectByVisibleText("Opel");             
// Thread.sleep(2000);

 
 
//          List<WebElement> select = s.getAllSelectedOptions();
//          
//          for(WebElement a :select)
//        	  System.out.println(a.getText());


Actions a = new Actions(driver);
a.moveToElement(dropdown).click().build().perform();

for(int i =0;i<2;i++)
{
	Thread.sleep(2000);
	a.sendKeys(Keys.DOWN).build().perform();
}
a.sendKeys(Keys.ENTER).build().perform();

Thread.sleep(5000);



              


		driver.close();
		
		
		
		
	}

}
