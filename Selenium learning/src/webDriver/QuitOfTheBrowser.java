package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitOfTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(4000);
		driver.quit();
		

	}

}
