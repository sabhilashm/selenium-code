package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fil = new FileInputStream("./testData/TestDataForDemo.properties");
		Properties pr=new Properties();
		pr.load(fil);
		String url = pr.getProperty("url");
		String Gender = pr.getProperty("Gender");
		String firstname = pr.getProperty("firstname");
		String lastname = pr.getProperty("lastname");
		String email = pr.getProperty("email");
		String password = pr.getProperty("password");
		String confirmpassword = pr.getProperty("confirmpassword");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		driver.findElement(By.linkText("Register")).click();
		if (Gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.id("gender-male")).click();
			
			
		}else {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		
		
		
		
	}

}
