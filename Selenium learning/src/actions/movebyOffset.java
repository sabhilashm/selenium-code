package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movebyOffset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.woodenstreet.com/bedroom-furniture?type=header_menu_bedroom");
		driver.findElement(By.id("loginclose1")).click();
		
		Actions action = new Actions(driver);
		action.moveByOffset(258, 163).perform();
		driver.quit();

	}

}
