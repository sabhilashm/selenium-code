package popUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfiramationPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://licindia.in/tech-term?gclid=EAIaIQobChMI1afsu4bjgQMV8qNmAh3GKQEYEAAYASAAEgKJqfD_BwE");
		driver.findElement(By.partialLinkText("Login")).click();
		driver.switchTo().alert().accept();

	}

}
