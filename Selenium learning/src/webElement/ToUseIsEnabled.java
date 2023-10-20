package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.xpath("//button[.='Log in']"));
		
		System.out.println(login.isEnabled());
	driver.findElement(By.name("username")).sendKeys("abhilash");
	driver.findElement(By.name("password")).sendKeys("12345678");
	System.out.println(login.isEnabled());
		

	}

}
