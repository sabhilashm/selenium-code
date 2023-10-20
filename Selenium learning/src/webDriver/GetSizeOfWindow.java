package webDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Dimension getsize = driver.manage().window().getSize();
		System.out.println(getsize);
		driver.quit();

	}

}
