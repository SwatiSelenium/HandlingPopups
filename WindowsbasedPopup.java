package Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowsbasedPopup 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement upload = driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-file wpcf7-validates-as-required form-control']"));
		upload.sendKeys("C:\\Users\\DELL\\Downloads\\GroTechMinds File Upload pdf.pdf");	
		
	}

}
