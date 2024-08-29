package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
     
    File file=new File("C:\\Users\\natar\\Desktop\\Java Selenium\\com.selenium\\src\\test\\resources\\Excel\\TestData.xlsx");
	FileInputStream fin=new FileInputStream(file);
	XSSFWorkbook workbook=new XSSFWorkbook(fin);
	XSSFSheet sheet=workbook.getSheetAt(0);
	
	Iterator<Row> rowItrator=sheet.iterator();
	while(rowItrator.hasNext())
	{
		Row row=rowItrator.next();
		
		Iterator<Cell> cellItrator=row.iterator();
		while(cellItrator.hasNext())
		{
			
			Cell cell=cellItrator.next();
			
			
			switch(cell.getCellType())
			{
			case STRING:
				System.out.println(cell.getStringCellValue());
				break;
			case NUMERIC:
				System.out.println(cell.getNumericCellValue());
			 break;
			case BOOLEAN:
				System.out.println(cell.getBooleanCellValue());
			
			}
			
			
			
		}
		
	}
		
		
		
		
	}

}
