package com.section3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Acti_DataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis=new FileInputStream("path of excel sheet");
//		Workbook book=WorkbookFactory.create(fis);
//		Sheet sh=book.getSheet(String sheetName);
//		Row row=sh.getRow(int rownum);
//		Cell cel=row.getCell(int cellnum);
//		String value1=cel.getStringCellValue(); //fetch String type of data
//		double value2=cel.getNumericCellValue();
		
		FileInputStream fis=new FileInputStream("C:\\Users\\suchi\\Documents\\Section-3\\DataFromExcel_Acti.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		//code optimization (String value1=cel.getStringCellValue())
		String data1=sh.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		double data2=sh.getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data2);
		
	}
	

}
