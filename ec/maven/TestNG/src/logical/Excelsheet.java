package logical;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet {
	
	public static void main (String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
	
	FileInputStream excel = new FileInputStream("/home/kedar/Documents/ORM-Project (1).xlsx");
//	FileInputStream excel = new FileInputStream("/home/kedar/Music/data.xlsx");
	// fileInputStream (“ We provide a path for a particular excel sheet”);
	Sheet a = WorkbookFactory.create(excel).getSheet("Sheet2");
	
	String b= a.getRow(0).getCell(0).getStringCellValue();
//	String c= a.getRow(1).getCell(0).getStringCellValue();
	long c= (long) a.getRow(1).getCell(0).getNumericCellValue();

//	String d= a.getRow(2).getCell(0).getStringCellValue();
//	10th/12th board certificate;
	
	Thread.sleep(2000);
		
	System.out.println(b);
	System.out.println(c);
	
//	A.HI();
//	System.out.println(d);
	}
}