package assignment;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Task2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(new URL("https://www.youtube.com/"));
		Thread.sleep(3000);
		String pagesoure = driver.getPageSource();
		System.out.println(pagesoure);
		driver.quit();

	}

}
