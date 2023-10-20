package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.google.com/doodles");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		for(;;)
		{
			try {
				driver.findElement(By.linkText("Margit Nordin's 126th Birthday")).click();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				
				js.executeScript("window.scrollBy(0,500)");
				//js.executeScript("window.scrollBy(0.500)");
			}
		}

	}

}
