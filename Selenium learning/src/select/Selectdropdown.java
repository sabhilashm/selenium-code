package select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804791%7Cb%7Copen%20an%20facebook%7C&placement=&creative=550525804791&keyword=open%20an%20facebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-369870425422%26loc_physical_ms%3D9062026%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=EAIaIQobChMI-KKnt4PkgQMVW6RmAh0Xvg2hEAAYASAAEgLwWfD_BwE");
		WebElement day = dr.findElement(By.id("day"));
		Select s= new Select(day);
List<WebElement> op = s.getOptions();
for (WebElement webEle : op) {
	if ("2"==webEle.getText()) {
		s.selectByIndex(1);
		
	}
	
}
		
		
		

	}

}
