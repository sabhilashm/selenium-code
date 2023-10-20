package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online-reservations.com/?hotelid=2825340&gclid=EAIaIQobChMIj4fkpOqigQMVIxB7Bx2Y2AQnEAAYAyAAEgLM-vD_BwE");
		String get = driver.getWindowHandle();
		System.out.println(get);
		driver.quit();
		}

}
