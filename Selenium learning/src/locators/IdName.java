package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.actitime.com/login.do");
				Thread.sleep(3000);
				driver.findElement(By.id("username")).sendKeys("admin");
				Thread.sleep(3000);
				driver.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(3000);
				driver.findElement(By.id("loginButton")).click();

			}

		


	}


