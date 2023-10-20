package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnDependsonMethod {
	
	@Test(enabled = true)
	public void createAccount()
	{
		Reporter.log("Created Done", true);
	}
	@Test(dependsOnMethods = "createAccount")
	public void editeAccount()
	{
		Reporter.log("edit Done", true);
	}
	@Test(dependsOnMethods = {"editeAccount","createAccount"})
	public void deleteAccount()
	{
		Reporter.log("delete Done", true);
	}
	

}
