package TestCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import MasterPage.TestBase;
import Pages.LoginPage;
import PseudoCode.TakeScreenshotOnFailure;

public class MercuryLogin {

	public MercuryLogin() throws IOException {
		super();
	}

	@Test
	public void doLoginTest() throws IOException
	{
		LoginPage lg= new LoginPage();
	    lg.doLogin();
	}
	
	@Test
	public void doLoginTest1() throws IOException
	{
		LoginPage lg= new LoginPage();
	    lg.doLoginFailure();
	}
	
	
	@AfterMethod
	public void getResult(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			TakeScreenshotOnFailure.captureScreenShot(result.getName());
		}
		TestBase.browser_close();
	}
}
