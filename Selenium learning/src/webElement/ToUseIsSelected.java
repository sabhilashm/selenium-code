package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseIsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		 WebElement selectetext = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		 System.out.println(selectetext.isSelected());
		 selectetext.click();
		 System.out.println(selectetext.isSelected());

	}

}
