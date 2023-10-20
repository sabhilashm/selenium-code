package webDriver;

import java.awt.Choice;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowsHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	String prId = driver.getWindowHandle();
	driver.findElement(By.id("newWindowsBtn")).click();
	Set<String> childIDs = driver.getWindowHandles();
	System.out.println(childIDs);
driver.quit();
	}

}
