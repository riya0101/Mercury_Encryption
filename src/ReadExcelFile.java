import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		ReadExcelFile rx= new ReadExcelFile();
		rx.readexcel();
		
		
	}
	
	void readexcel() throws IOException
	{
		FileInputStream fis= new FileInputStream("C:\\Users\\sonalipat\\Desktop\\Sanity_CheckList.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheet("Sanity");
		
		System.out.println(sh.getLastRowNum());
		System.out.println(sh.getRow(0).getLastCellNum());
		
		System.out.println(sh.getPhysicalNumberOfRows());
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());
		
		
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sh.getRow(0).getCell(2).getStringCellValue());
		//System.out.println(sh.getRow(0).getCell(3).getStringCellValue());
		
		int rowcount=sh.getLastRowNum();
		int colcount=sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
			for(int j=1;j<colcount;j++)
			{
				
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
				System.out.println("Print i------"+i);
				System.out.println("Print j------"+j);
			}
			
		}
	}

}
