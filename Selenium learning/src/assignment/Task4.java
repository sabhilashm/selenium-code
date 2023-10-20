package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.barbequenation.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
