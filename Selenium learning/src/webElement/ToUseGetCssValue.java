package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseGetCssValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.id("loginButton")).getCssValue("border-radius"));
		System.out.println(driver.findElement(By.id("loginButton")).getCssValue("font-size"));

	}

}
