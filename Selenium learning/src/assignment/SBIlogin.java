package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SBIlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		
		driver.findElement(By.id("userName")).sendKeys("abhilash");
		driver.findElement(By.id("password")).sendKeys("12122qasasa");
		Actions act= new Actions(driver);
		
		WebElement i = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		act.moveByOffset(1209, 302).clickAndHold().perform();
		//act.clickAndHold(i).perform();
		

	}

}
