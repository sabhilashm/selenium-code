package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class FullScreenTheWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
