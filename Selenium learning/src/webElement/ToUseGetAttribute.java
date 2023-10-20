package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		String tooltip = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
		Thread.sleep(3000);
		System.out.println(tooltip);

	}

}
