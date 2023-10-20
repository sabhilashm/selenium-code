package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfirationAnnontation {
	
	@BeforeSuite
	    public void beforesuite() 
	{
		Reporter.log("beforesuite", true);
	}
	@AfterSuite
    public void aftersuite() 
{
	Reporter.log("aftersuite", true);
}

	@BeforeClass
    public void beforeclass() 
{
	Reporter.log("beforeclass", true);
}
	@AfterClass
    public void afterclass() 
{
	Reporter.log("afterclass", true);
}
	@BeforeMethod
    public void beforemethod() 
{
	Reporter.log("beforemethod", true);
}
	@AfterMethod
    public void aftermethod() 
{
	Reporter.log("aftermethod", true);
}
	@AfterTest
    public void aftertest() 
{
	Reporter.log("aftertest", true);
}
	@BeforeTest
    public void beforetest() 
{
	Reporter.log("beforetest", true);
}
	@Test
    public void test() 
{
	Reporter.log("test", true);
}
	

}
