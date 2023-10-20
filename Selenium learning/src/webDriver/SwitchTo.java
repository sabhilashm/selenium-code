package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parentId = driver.getWindowHandle();
		driver.findElement(By.id("newWindowsBtn")).click();
		Thread.sleep(2000);
		Set<String> allwindosIds = driver.getWindowHandles();
		allwindosIds.remove(parentId);
		for (String windowId : allwindosIds) {
			
			driver.switchTo().window(windowId);
			Thread.sleep(2000);
			driver.close();
			
		}
		Thread.sleep(2000);
		driver.quit();

		
		

	}

}
