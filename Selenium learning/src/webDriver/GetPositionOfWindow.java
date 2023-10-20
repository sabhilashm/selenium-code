package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPositionOfWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Point getpostion = driver.manage().window().getPosition();
		System.out.println(getpostion);
		driver.quit();

	}

}
