package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeTheWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     ChromeDriver driver = new ChromeDriver();
     Thread.sleep(3000);
     driver.manage().window().maximize();
     driver.get("https://www.facebook.com/login/");
     driver.quit();
	}

}
