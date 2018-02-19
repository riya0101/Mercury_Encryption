package Pages;

import java.io.IOException;

import org.openqa.selenium.By;

import MasterPage.TestBase;
import PseudoCode.encrypt;

public class LoginPage extends TestBase {

	public LoginPage() throws IOException {
		super();
	}
	
	public void doLogin() throws IOException
	{
		//dr.findElement(By.xpath(prop.getProperty("login_xpath"))).sendKeys(prop.getProperty("username"));
		TestBase.doSendKeys("login_xpath", "username");
		dr.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(encrypt.doDecrypt(encrypt.doEncrypt()));
		dr.findElement(By.xpath(prop.getProperty("signin_xpath"))).click();
	}
	
	public void doLoginFailure() throws IOException
	{
		dr.findElement(By.xpath(prop.getProperty("login_xpathf"))).sendKeys(prop.getProperty("username"));
		dr.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(encrypt.doDecrypt(encrypt.doEncrypt()));
		dr.findElement(By.xpath(prop.getProperty("signin_xpath"))).click();
	}

}
