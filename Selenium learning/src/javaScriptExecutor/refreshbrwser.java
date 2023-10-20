package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class refreshbrwser {
	
	
	
			@Test
			public void name() throws InterruptedException {
				
			
			WebDriver driver= new ChromeDriver();
			
		
			driver.get("https://www.google.com/doodles");
			JavascriptExecutor js= (JavascriptExecutor) driver;
			
			Thread.sleep(2000);
			
			js.executeScript("history.go()");
				
				
			

		}
}

	



