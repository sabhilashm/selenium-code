package popUp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://demo.actitime.com/login.do");
		String pri = driver.getWindowHandle();
	
	
		driver.findElement(By.linkText("actiTIME Inc.")).click();
	      Set<String> chi = driver.getWindowHandles();
	      chi.remove(pri);
	      for(String hi: chi)
	      {
	    	  driver.switchTo().window(hi);
	    	  driver.findElement(By.linkText("Log in")).click();
	    	  
	      }
	     
	      
		

	}

}
