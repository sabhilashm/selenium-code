package assignment;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShortamazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=14429828358525160589&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061995&hvtargid=kwd-10573980&hydadcr=14453_2316415");
		Thread.sleep(3000);
		TakesScreenshot tc=(TakesScreenshot) driver;
		File temp = tc.getScreenshotAs(OutputType.FILE);
		File scr= new File("./ErrorScreenshort/amazon.png");
		FileHandler.copy(temp, scr);
	}

}
