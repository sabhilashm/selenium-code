package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseClear {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demo.vtiger.com/vtigercrm/");
Thread.sleep(3000);
driver.findElement(By.id("username")).clear();
 WebElement username = driver.findElement(By.id("username"));
 username.clear();
 username.sendKeys("abhi");
 WebElement password = driver.findElement(By.id("password"));
 password.clear();
 password.sendKeys("1234");
 driver.quit();

	}

}
