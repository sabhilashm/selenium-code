package Actitime;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class task extends baseClass{
	
	@Test
	public void tasklink() {
		
		driver.findElement(By.linkText("Tasks")).click();
		
	}
	

}
