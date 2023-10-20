package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		driver.findElement(By.xpath("//input [@placeholder='Search for Products, Brands and More']")).sendKeys("iphone 14 pro");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Pro (Deep Purple, 128 GB)']")).click();
		Thread.sleep(4000);
		String price = driver.findElement(By.xpath("(//div[@class='_25b18c'])[1]")).getText();
		System.out.println(price.substring(1));
		
		

	}

}
