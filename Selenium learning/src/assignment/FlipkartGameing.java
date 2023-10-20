package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartGameing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Gaming']")).click();
		Thread.sleep(3000);
		String price = driver.findElement(By.xpath("//a[text()='MSI Core i9 13th Gen 13980HX - (32 GB/2 TB SSD/Windows ...']/../..//div[@class='_25b18c']")).getText();
		System.out.println(price);
String[] t=price.split("\\?");
System.err.println(t[0]);
for (String string : t) {
	System.out.println(string);
	
}
	}

}
