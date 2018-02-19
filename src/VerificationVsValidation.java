import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationVsValidation {

	
	@Test
	public void foo() throws IOException
	{
	int i=20;
	int j=10;
	
	Assert.assertTrue(i>j);
	System.out.println("I is greater");
	
	Assert.assertFalse(j>i, "not printing message");
	
	
	FileInputStream fis= new FileInputStream("C:\\Users\\sonalipat\\Desktop\\Sanity_CheckList.xlsx");	
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sh=wb.getSheetAt(0);
	System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
	DataFormatter formatter = new DataFormatter();
	
	//getrow count
	//getcell count
	System.out.println("Total row count  "+sh.getPhysicalNumberOfRows());
	System.out.println("Total Columns count  "+sh.getRow(0).getPhysicalNumberOfCells());	
	int row=sh.getPhysicalNumberOfRows();
	int col=sh.getRow(0).getPhysicalNumberOfCells();
	for (int k=0;k<row;k++)
	{
		for (int l=0;l<col;l++)
		{	
			System.out.println(formatter.formatCellValue(sh.getRow(k).getCell(l))+"\n");
		}
		
	}
	
	
	
	/*if(i>j)
	 * 
	{
		System.out.println("I is greater");
	}
	else
	{
		System.out.println("I is smaller & hence TC is failed");
	}*/
	}
}
