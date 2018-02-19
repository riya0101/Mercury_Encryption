import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ReadDynamicTable {
	

	@Test()
	public void readtable()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.yahoo.com");
		dr.findElement(By.xpath(".//a[text()='Finance']")).click();
		Actions act=new Actions(dr);
		WebDriverWait wait= new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.elementToBeClickable(dr.findElement(By.xpath(".//div[text()='Industry News']"))));
		act.click(dr.findElement(By.xpath(".//div[text()='Industry News']"))).build().perform();
		act.click(dr.findElement(By.xpath(".//a[@title='Financial']"))).build().perform();
		
		System.out.println(dr.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText());
		dr.quit();
		
		
	}
}
