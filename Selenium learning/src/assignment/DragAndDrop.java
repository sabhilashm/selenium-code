package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.id("Accepted Elements")).click();
		
		WebElement iframe = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		driver.switchTo().frame(iframe);
		
		WebElement drag1 = driver.findElement(By.xpath("//div[@id='draggable-nonvalid']"));
		WebElement drag2=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement tr = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act= new Actions(driver);
		act.dragAndDrop(drag1, tr).perform();
		act.dragAndDrop(drag2, tr).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("Propagation")).click();
		
		WebElement iframe1 = driver.findElement(By.xpath("(//iframe[@class='demo-frame lazyloaded'])[2]"));
		
		driver.switchTo().frame(iframe1);
		WebElement drag3 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		
		WebElement tar = driver.findElement(By.xpath("//p[text()='Inner droppable (greedy)']"));
		act.dragAndDrop(drag3, tar).perform();
		
	
		

	}

}
