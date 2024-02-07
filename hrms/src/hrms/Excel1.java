package hrms;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel1 {
	public static void main(String args[]) throws Exception {
		//steps
		
		FileInputStream file= new FileInputStream("C:\\Users\\HP\\Downloads\\jar files\\Excel\\Book1.xls");
		Workbook wb= Workbook.getWorkbook(file);
		Sheet sh= wb.getSheet(0);
//		int row=3;
		int rc=sh.getRows();
		System.out.println("Total Rows are:"+rc);
		int cc= sh.getColumns();
		System.out.println("Total Columns are:"+cc);
		System.out.println("Total Data are :"+(rc*cc));
		for(int i=1;i<rc;i++) {
			String EMPID=sh.getCell(0,i).getContents();
			String name=sh.getCell(1,i).getContents();
			String email=sh.getCell(2,i).getContents();
			String no=sh.getCell(3,i).getContents();
			System.out.println(EMPID);
			System.out.println(name);
			System.out.println(email);
			System.out.println(no);
			System.out.println("=========================DATA "+i+" Added=======================");
		}
		
		
		
	}


}
