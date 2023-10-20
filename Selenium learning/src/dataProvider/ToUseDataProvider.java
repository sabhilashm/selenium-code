package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ToUseDataProvider {
	
	
	@DataProvider(name = "cred")
	public String[][] senddata() {
		String[][] asa = {{"admin","mang"},{"tra","va"},{"kar","asas"}};
		return asa;
		
	}
	
	@Test(dataProvider = "cred")
	public void login(String[] credentials) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(credentials[0]);
		driver.findElement(By.name("pwd")).sendKeys(credentials[1]);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		driver.quit();
		
	}

}
