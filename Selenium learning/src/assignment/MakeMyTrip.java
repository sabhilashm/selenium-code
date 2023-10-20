package assignment;

import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.makemytrip.com/");
		Actions act= new Actions(driver);
		Thread.sleep(3000);
		act.moveByOffset(45, 199).click().perform();
		Thread.sleep(3000);
		act.moveByOffset(45, 199).click().perform();
		//driver.findElement(By.className("close")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for(;;) {
		try {
			driver.findElement(By.xpath("//div[text()='January 2024']/../..//p[text()='15']")).click();
			break;
		} catch (Exception e) {
			// TODO: handle exception
			driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		}
		}

		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']")).click();
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		driver.findElement(By.xpath("//span[text()='To']")).click();
		driver.findElement(By.xpath("New Delhi, India")).click();
	}

}
