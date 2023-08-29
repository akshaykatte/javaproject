package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {

	public static void main(String[] args)throws Exception {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		textBox.sendKeys("Vivo");
		WebElement clickBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		clickBtn.click();
		Thread.sleep(5000);
		
//		
//		
		WebElement vivo = driver.findElement(By.xpath("//img[@alt='Vivo Y16 (Drizzling Gold, 3GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers']"));
	    vivo.click();

	    Set<String> Windows = driver.getWindowHandles();
		
		Iterator<String> win = Windows.iterator();
		
		String main = win.next();
		String sub =win .next();
		
		driver.close();
		
		driver.switchTo().window(sub);
	    
	    WebElement cartBtn = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	    cartBtn.click();
	    driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button-announce']")).click();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
