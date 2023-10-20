package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
	
	public static void main(String[] arg) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		//driver.findElement(By.id("loginclose1")).click();
		for(;;) {
		try {
			driver.findElement(By.id("loginclose1")).click();
			break;
			
		} catch (Exception e) {
		 Thread.sleep(3000);
		}
		}
		List<WebElement> all = driver.findElements(By.xpath("//ul[@class='container flex']"));
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
		}
		
	}

}
