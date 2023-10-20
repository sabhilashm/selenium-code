package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLunchGmailBrowserUsingGetMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F%3Ftab%3Drm%26ogbl&osid=1&passive=1209600&service=mail&ifkv=AXo7B7WsAb8_yYGQam1Uf_PDqtGIWKyEkodAKMV2235WU3k-z5AzfQFmqyFIiYztNZcM9U08akKwTw&theme=glif&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	}

}
