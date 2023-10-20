package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShortOZomato {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(3000);
		File tem = driver.findElement(By.xpath("//img[@alt='Zomato logo' and @loading='lazy']")).getScreenshotAs(OutputType.FILE);
		File scr= new File("./ErrorScreenshort/zomato.png");
		FileHandler.copy(tem, scr);
	}

}
