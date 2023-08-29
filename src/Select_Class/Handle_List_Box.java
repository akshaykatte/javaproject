package Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_List_Box {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("katte");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("akshaykatte@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Akshay123");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Thread.sleep(2000);
		Select s = new Select(day);
		s.selectByValue("16");
		
		
		
		Thread.sleep(2000);
		Select m = new Select(month);
		m.selectByVisibleText("May");
		
		Thread.sleep(2000);
		Select y = new Select(year);
		y.selectByValue("1998");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).click();

	}

}
