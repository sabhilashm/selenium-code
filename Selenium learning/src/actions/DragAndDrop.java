package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement photgr = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	  //iframe
		driver.switchTo().frame(photgr);
		
		//photomanger
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		//trash
		WebElement trash = driver.findElement(By.id("trash"));
		
		//actions
		Actions action = new Actions(driver);
		action.dragAndDrop(image1, trash).perform();
		action.dragAndDrop(image2, trash).perform();
		action.dragAndDrop(image3, trash).perform();
		action.dragAndDrop(image4, trash).perform();
		
		//gallery
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		action.dragAndDrop(image1, gallery).perform();
		action.dragAndDrop(image2, gallery).perform();
		action.dragAndDrop(image3, gallery).perform();
		action.dragAndDrop(image4, gallery).perform();
	}

}
