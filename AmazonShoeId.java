package Popups;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//program from 5th Sept video

public class AmazonShoeId {
//
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	//	EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement searcht = driver.findElement(By.id("twotabsearchtextbox"));
		searcht.sendKeys("shoe");
		searcht.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		//indexing of shoe is actually starting from no 6 on shoe page, chk by doing enter button in html code
		WebElement shoeno = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[8]"));
		shoeno.click();
		Set<String> ref = driver.getWindowHandles();
		Iterator<String> pc = ref.iterator();
		String parent = pc.next(); // will give parend id
		String child = pc.next(); // will give 1st child id 
		driver.switchTo().window(child);  // control moved to child
		Thread.sleep(3000);
		driver.close(); // child window closes
	}

}
