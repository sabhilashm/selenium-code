package popUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToAvoidNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		//setting.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(setting);
		
		driver.get("https://www.yatra.com/");
		driver.manage().deleteAllCookies();
		
		
		

	}

}
