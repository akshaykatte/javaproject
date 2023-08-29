package Practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_In_One {

	public static void main(String[] args) throws Exception {
		
		
		// extract only captal letter from string
		
//		String str = "AutoMation";
//		
//		for(int i=0;i<str.length();i++)
//		{
//			char ch =str.charAt(i);
//		if(Character.isUpperCase(ch))
//		{
//			System.out.print(ch+" ");
//		}
//		}
		
		// fetch the duplicate Latter from string
		
//		String str = "automation";
//		
//		char ch []=str.toCharArray();
//		
//		for(int i=0;i<str.length();i++)
//		{
//			
//			for(int j=i+1;j<str.length();j++)
//				if(ch[i]==ch[j])
//				{
//					System.out.print(ch[j]);
//				}
//			
//		}
		
				
		
		// count character from line
		
//		String str = "hi am an automation test engineer i have total two year of experience";
//		
//		int count=0;
//		
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			if(ch !=' ')
//			{
//				count++;
//			}
//		}
//		System.out.println(count);
//		
		
		// find duplicate char from line
//		
//		String str = "hi good morning good hi ";
//		
//		String word[]=str.split(" ");
//		
//		
//		Set<String> set = new HashSet<>();	
//		
//		for(int i=0;i<word.length;i++)
//		{
//			for(int j=0;j<word.length;j++)
//				
//				if(word[i].equals(word[j])&& i != j)
//				{
//					set.add(word[i]);
//				}
//		}
//		
//		
//System.out.println(set);
//		
//		Iterator a =set.iterator();
//		
//		
		
		
		
		// Window Handles 
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://portal1.passportindia.gov.in/AppOnlineProject/online/apptAvailStatus']")).click();
		Thread.sleep(2000);
		String win1 = driver.getWindowHandle();
		
		System.out.println(win1);
		
		Set<String> x = driver.getWindowHandles();
		
		Iterator<String> z = x.iterator();
		
		String first = z.next();
		String second = z.next();
		
		System.out.println(first);
		System.out.println(second);
		
		driver.close();
		
		
	}

}
