package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeTheWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(10000);
		driver.close();

	}

}
