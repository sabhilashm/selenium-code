package Actitime;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class report extends baseClass {
	
	@Test
	public void reportlink() {
		
		driver.findElement(By.linkText("Reports")).click();
		
		
	}

}
