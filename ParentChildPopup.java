package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChildPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[.='Google']")).click();
		
		Set<String> parentandchild = driver.getWindowHandles();
		System.out.println(parentandchild);
		
		Iterator<String> a = parentandchild.iterator();  // using iterator method
		String parentid = a.next(); // 1st next method will give u parent id seperate
		String childid = a.next(); // 2nd next method will give u 1st child id
		System.out.println(parentid);
		System.out.println(childid);
		
		driver.switchTo().window(childid); // control is moved to child window
		Thread.sleep(3000);
		driver.close(); // child window closes
		
		//although child window is closed/died, control is still with child.
		// so moving control to parent
		driver.switchTo().window(parentid);
		Thread.sleep(3000);
		driver.close(); // closing parent window
	}
}
