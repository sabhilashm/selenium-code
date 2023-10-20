package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String error = driver.findElement(By.xpath("//span[contains(text(),'Login was unsuccessful. Please correct the errors and try again.')]")).getText();
		String error1=driver.findElement(By.xpath("//li[contains(text(),'No customer account found')]")).getText();
		String full = error.concat(error1);
		System.out.println(full);
		if (full.equals("Login was unsuccessful. Please correct the errors and try again.No customer account found")) {
			driver.quit();
			
		}
		

	}

}
