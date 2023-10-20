package Actitime;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class baseClass {
	public WebDriver driver;
	FileInputStream file;
	Properties pro;
	
	@BeforeClass
	public void launch() throws IOException {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		file= new FileInputStream("./testData/testData.properties");
		pro= new Properties();
		pro.load(file);
		String url = pro.getProperty("actimeurl");
		driver.get(url);
		String currenturl = driver.getCurrentUrl();
		Assert.assertEquals(url,currenturl );
		
	}
	
	@BeforeMethod
	public void login() throws IOException {
		pro.load(file);
		String actimeusername = pro.getProperty("actimeusername");
		String actimepassword = pro.getProperty("actimepassword");
		driver.findElement(By.id("username")).sendKeys(actimeusername);
		driver.findElement(By.name("pwd")).sendKeys(actimepassword);
		driver.findElement(By.id("loginButton")).click();
		

	}
	@AfterMethod
	public void logout() {
		
		driver.findElement(By.id("logoutLink")).click();
		
	}
	@AfterClass
	public void close() {
		driver.quit();
		
	}

}
