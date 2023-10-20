package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(5000);
		driver.close();
	}

}
