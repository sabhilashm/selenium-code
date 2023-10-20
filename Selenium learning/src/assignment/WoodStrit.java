package assignment;

import java.time.Duration;

import org.asynchttpclient.webdav.WebDavCompletionHandlerBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WoodStrit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		driver.findElement(By.linkText("Sofas")).click();
		driver.findElement(By.linkText("Fabric Sofas")).click();
		driver.findElement(By.xpath("//span[text()='1 Seater Fabric Sofas']")).click();
		driver.findElement(By.xpath("//a[text()='Adley 1 Seater Sofa (Velvet, Chestnut Brown)']/../..//p[text()=' Add to Cart']")).click();
		
		
		driver.findElement(By.linkText("Living")).click();
		driver.findElement(By.linkText("TV Units")).click();
		//driver.findElement(By.xpath("//span[text()='1 Seater Fabric Sofas']")).click();
		driver.findElement(By.xpath("//a[text()='Hailey Engineered Wood Wall-Mounted Tv Unit with Shelf & Drawers (Exotic Teak Finish)']/../..//p[text()=' Add to Cart']")).click();
		
		driver.findElement(By.linkText("Bedroom")).click();
		driver.findElement(By.linkText("King Size Beds")).click();
		driver.findElement(By.xpath("//span[text()='King Size Beds']")).click();
		driver.findElement(By.xpath("//a[text()='Ferguson Sheesham Wood Bed With Storage Drawers (King Size, Honey Finish)']/../..//p[text()=' Add to Cart']")).click();
		
	}

}
