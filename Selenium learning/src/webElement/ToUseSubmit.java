package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseSubmit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.instagram.com/");
		Thread.sleep(4000);
		dr.findElement(By.name("username")).sendKeys("abhi");
		dr.findElement(By.name("password")).sendKeys("1234");
		Thread.sleep(4000);
		dr.findElement(By.xpath("//div[text()='Log in']")).submit();

	}

}
