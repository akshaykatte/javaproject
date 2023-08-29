package Select_Class;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Selected_Option {

	public static void main(String[] args)throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		//Thread.sleep(2000);
		WebElement drop = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(drop);
		
		boolean z = s.isMultiple();
				System.out.println(z);
		s.selectByValue("16");
		//Thread.sleep(2000);
		String option = s.getFirstSelectedOption().getText();
		System.out.println(option);
		
		List<WebElement> all = s.getOptions();
		
		for(WebElement f :all)
		{
			System.out.println(f.getText());
		}
		
	}

}
