package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToDisable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		Thread.sleep(4000);
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//a[text()='jdk-8u381-linux-aarch64.rpm']")).click();
				break;
			} catch (Exception e) {
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(4000);
			}
		}
		
		WebElement hid = driver.findElement(By.xpath("//a[text()='Download jdk-8u381-linux-aarch64.rpm']"));
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", hid);
		

	}

}
