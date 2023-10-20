package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class acttime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String Logintittle="actiTIME - Login";
		String username="admin";
		String password="manager";
		String homepage="actiTIME -  Enter Time-Track";
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.actitime.com/login.do");
		try {
			driver.get("https://demo.actitime.com/login.do");
				} catch (Exception e) {
					driver.switchTo().alert().accept();
				}
				
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		String exploginti = driver.getTitle();
		if (Logintittle.equalsIgnoreCase(exploginti)) {
			System.out.println("Login page");
			
		}
		
		WebElement usernametextfield = driver.findElement(By.id("username"));
		usernametextfield.clear();
		usernametextfield.sendKeys("admin");
		String explusername = usernametextfield.getAttribute("value");
		if (username.equals(explusername)) {
			System.out.println("usename passed");
			
		}
		WebElement passwdtextfield = driver.findElement(By.name("pwd"));
		passwdtextfield.clear();
		passwdtextfield.sendKeys("manager");
		String explpassword = passwdtextfield.getAttribute("value");
		if (password.equals(explpassword)) {
			System.out.println(" password passed");
			
		}
		
		WebElement loginbutton = driver.findElement(By.id("loginButton"));

		Thread.sleep(5000);
		
		String homepag = driver.getTitle();
		if (homepage.equals(homepag)) {
			System.out.println("home page");
			
		}
		
		
		
		
		

	}

}
