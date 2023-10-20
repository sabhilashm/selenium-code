package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningTestNg {
	@Test
	public void cri() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		Reporter.log("Hi 1", true);
		driver.quit();
		
	}
	@Test(enabled = false)
	public void bask() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://baskinrobbinsindia.com/");
		Reporter.log("Hi 2", true);
		driver.quit();
		
	}
	@Test(invocationCount = 3, threadPoolSize = 3)
	public void amazon() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=10396710388699172283&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062000&hvtargid=kwd-10573980&hydadcr=14453_2367553");
		Reporter.log("Hi 3", true);
		driver.quit();
		
	}
}
