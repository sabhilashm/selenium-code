package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[class='ico-register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Abhilash");
		driver.findElement(By.id("LastName")).sendKeys("salhali");
		driver.findElement(By.id("Email")).sendKeys("abhilash.salhalli@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Abhi@12345");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Abhi@12345");
		driver.findElement(By.id("register-button")).click();

	}

}
