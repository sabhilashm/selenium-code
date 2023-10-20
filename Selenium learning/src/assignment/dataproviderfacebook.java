package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderfacebook {
	
	
	@DataProvider(name = "cred")
	public String [][] senddata() {
		String [][]tr= {{"abhi","12345"},{"sang","12345"},{"van","211212"}};
		return tr;
		
	}
	
	@Test(dataProvider = "cred")
	public void login(String[] credentials) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys(credentials[0]);
		driver.findElement(By.name("pass")).sendKeys(credentials[1]);
		Thread.sleep(1000);
		driver.findElement(By.id("loginbutton")).click();
		driver.quit();
	}

}
