package assignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebSopWithXlsFileData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
	
FileInputStream inp= new FileInputStream("./testData/testdatawebsop.xlsx");
		
		
		Workbook book=WorkbookFactory.create(inp);
			
		
		String url = book.getSheet("Sheet1").getRow(0).getCell(0).toString();
		
	
		
		String Gender = book.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String firstname = book.getSheet("Sheet1").getRow(2).getCell(0).toString();
		String lastname = book.getSheet("Sheet1").getRow(3).getCell(0).toString();
		String email = book.getSheet("Sheet1").getRow(4).getCell(0).toString();
		String password = book.getSheet("Sheet1").getRow(5).getCell(0).toString();
		String confirmpassword =book.getSheet("Sheet1").getRow(6).getCell(0).toString();
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(url);
		
		driver.findElement(By.linkText("Register")).click();
		if (Gender.equalsIgnoreCase("Male")) {
			driver.findElement(By.id("gender-male")).click();
			
			
		}else {
			driver.findElement(By.id("gender-female")).click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
		

	}

}
