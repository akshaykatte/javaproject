package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) throws Exception {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoqa.com/browser-windows");

String main = driver.getWindowHandle();
System.out.println("main parent   "+ main);

driver.findElement(By.xpath("//button[@id='tabButton']")).click();



Set<String> wind = driver.getWindowHandles();


Iterator<String> all = wind.iterator();

 String parent = all.next();

System.out.println("Parent ID  "+parent );

String child = all.next();

System.out.println("Child ID  "+child);
driver.close();



driver.switchTo().window(child);
Thread.sleep(5000);
driver.close();







	}

}
