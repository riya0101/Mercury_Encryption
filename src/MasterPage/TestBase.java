package MasterPage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	
	public static WebDriver dr;
	public static Properties prop;
	
    public TestBase() throws IOException
    {
    	
		FileInputStream fis= new FileInputStream(System.getProperty("user.dir")+"\\src\\ObjectRepository\\ObjectRepo.properties");
		
    	
    	prop= new Properties();
    	prop.load(fis);
    	
    	if(prop.getProperty("browser").equals("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\src\\WebDrivers\\chromedriver.exe");
			dr= new ChromeDriver();
    	}
    	else if(prop.getProperty("browser").equals("ff"))
    	{
    		dr= new FirefoxDriver();
    	}
    	
    	dr.get(prop.getProperty("url"));
    	dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	dr.manage().window().maximize();
    }
    
    public static void doSendKeys(String locator,String text)
    {
    	dr.findElement(By.xpath(prop.getProperty(locator))).sendKeys(prop.getProperty(text));
    }
    
    public static void browser_close()
    {
    	dr.quit();
    }
    
  
	
}
