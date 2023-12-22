package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Javascriptpopup {

	public static void main(String[] args) 
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
	//	driver.switchTo().alert().accept(); // javascript popup handling method1
	//	driver.switchTo().alert().dismiss(); // javascript popup handling method2
		WebElement username = driver.findElement(By.id("1"));
		username.sendKeys("ABCD");
	}
	

}
