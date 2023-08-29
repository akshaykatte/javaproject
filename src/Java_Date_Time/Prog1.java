package Java_Date_Time;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prog1 {

	public static void main(String[] args) throws Exception {
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
//		
//		Date date = new Date();
//		
//		String d = dateFormat.format(date);
//		System.out.println(d);
//				
		//Date date = new Date();
		//SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		//String d = formatter.format(date);
	//	System.out.println(d);
		Date d = new Date();
        String FileName = d.toString().replace(":", "_").replace(" ", "_") + ".jpeg";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\91899\\eclipse-workspace\\JavaProg\\Screenshots\\"+FileName);
		FileHandler.copy(src, dest);
		
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
