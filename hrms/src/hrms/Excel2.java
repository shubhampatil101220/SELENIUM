package hrms;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {
	public static void main (String args[]) throws Exception {
		
		 FileInputStream fileinput = new FileInputStream("C:\\\\Users\\\\HP\\\\Downloads\\\\jar files\\\\Excel\\\\Book1.xlsx");
		    XSSFWorkbook workbook = new XSSFWorkbook(fileinput);
		    XSSFSheet sheet = workbook.getSheet("test");
		    System.out.println(sheet.getSheetName());
		    System.out.println(sheet.getLastRowNum());
		System.out.println("Before updating Cell Data "+
		                                      sheet.getRow(2).getCell(1));
		    // Write the data to excel file
		    XSSFCell cell =  sheet.getRow(2).getCell(1);
		    cell.setCellValue("Test123");
		    fileinput.close();
		    FileOutputStream fileOut = new FileOutputStream("C:\\\\Users\\\\HP\\\\Downloads\\\\jar files\\\\Excel\\\\Book1.xlsx");
		    workbook.write(fileOut);
		    System.out.println("Updated data after write is done " + cell.getStringCellValue());
		    fileOut.close();
	}

}
