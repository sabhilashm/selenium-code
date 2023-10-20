package batchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class tvs {
	@Test(groups = "system")
	public void toLaunchtvs() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tvsmotor.com/book-a-ride?11&utm_campaign=tvs_radeon_agl_cpc_prospect_performance_april_23_generic_phrase_keymarkets&utm_content=search_search_features&utm_medium=paidsearch&utm_source=google&gclid=EAIaIQobChMI9KfgkZf8gQMVikmLCh16bQohEAAYASAAEgIVqvD_BwE");
		Reporter.log("tvs Done", true);
		driver.quit();
		
		
	}

}
