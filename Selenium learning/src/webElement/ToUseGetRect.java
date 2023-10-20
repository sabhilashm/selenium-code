package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Rectangle gect = driver.findElement(By.id("loginButton")).getRect();
		System.out.println(gect.getX());
		System.out.println(gect.getY());
		System.out.println(gect.getHeight());
		System.out.println(gect.getWidth());

	}

}
