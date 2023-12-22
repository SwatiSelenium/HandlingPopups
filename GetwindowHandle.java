package Popups;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetwindowHandle {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[.='Google']")).click();
		String parent =driver.getWindowHandle();
		Set<String> parentandchild = driver.getWindowHandles();
		System.out.println(parent);
		System.out.println(parentandchild);
		driver.close(); // closes on;y parent window as control is with it
		driver.quit(); // closes both parent an child window
	}

}
