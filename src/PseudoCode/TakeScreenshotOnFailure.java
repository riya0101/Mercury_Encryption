package PseudoCode;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import MasterPage.TestBase;

public class TakeScreenshotOnFailure extends TestBase {
	
	
	public TakeScreenshotOnFailure() throws IOException {
		super();
	}

	public static void captureScreenShot(String TestCaseName) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) dr;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./ScreenShots/"+TestCaseName+".png"));	
	}

}
