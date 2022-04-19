package readExcelData;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception 
	{
		File file=new File("C:\\Users\\yugandhar.palyam\\Documents\\Book1.xlsx");
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=wb.getSheetAt(0);
		//String data=sheet.getRow(1).getCell(3).getStringCellValue();
		//System.out.println("data is " + data);
		int rowcount=sheet.getLastRowNum();
		System.out.println("total row count " + rowcount);
		for(int row=0;row<rowcount;row++) {
			String data=sheet.getRow(row).getCell(0).getStringCellValue();
			System.out.println("data from row is " + row + "is " + data);
		}
		wb.close();
		
		
		

	}
	public static void sample ()throws Exception 
	{
		File file=new File("C:\\Users\\yugandhar.palyam\\Documents\\Book1.xlsx");
		FileInputStream inputStream=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		XSSFSheet sheet=wb.getSheetAt(0);
		//String data=sheet.getRow(1).getCell(3).getStringCellValue();
		//System.out.println("data is " + data);
		int rowcount=sheet.getLastRowNum();
		System.out.println("total row count " + rowcount);
		for(int row=0;row<rowcount;row++) {
			String data=sheet.getRow(row).getCell(0).getStringCellValue();
			System.out.println("data from row is " + row + "is " + data);
		}
		wb.close();
		
		
		

	}

}
