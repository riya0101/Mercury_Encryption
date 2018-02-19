import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PracSel {

	
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
	
		dr.navigate().to("http://newtours.demoaut.com");
//		String MainWin=dr.getWindowHandle();
//	    Set<String> wins=dr.getWindowHandles();
//	    Iterator itr= wins.iterator();
//	    itr.hasNext();
//	    dr.switchTo().window(MainWin);
//		dr.quit();
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		WebElement wb=dr.findElement(By.xpath("//input[@name='tripType'][2]"));
		System.out.println("  displayed  " + wb.isDisplayed());
		System.out.println("  enabled  " + wb.isEnabled());
		System.out.println("   selected " + wb.isSelected());
		dr.quit();
	}
}
