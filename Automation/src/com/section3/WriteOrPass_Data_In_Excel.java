package com.section3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteOrPass_Data_In_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\suchi\\Documents\\Section-3\\WriteData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		sh.createRow(1).createCell(1).setCellValue("admin");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\suchi\\Documents\\Section-3\\WriteData.xlsx"); //from java to excel
		book.write(fos);
		fos.flush();
		System.out.println("pass");
		
	}
	
}
