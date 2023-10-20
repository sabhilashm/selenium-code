package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		//Thread.sleep(5000);
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Chaiyya Chaiyya HD | Dil Se -1998 "
		 		+ "| Shahrukh Khan & Malaika Arora | Sukhwinder Singh & Sapna Awasthi");
		 driver.findElement(By.id("search-icon-legacy")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[@title='Chaiyya Chaiyya HD | Dil Se -1998 | Shahrukh Khan & Malaika Arora"
		 		+ " | Sukhwinder Singh & Sapna Awasthi']")).click();
			
	
		
	}

}
