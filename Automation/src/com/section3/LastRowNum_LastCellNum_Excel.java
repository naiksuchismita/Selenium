package com.section3;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LastRowNum_LastCellNum_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\suchi\\Documents\\Section-3\\LastRowLastCell.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		//to get the last row no.
		int lastrow=sh.getLastRowNum();
		System.out.println(lastrow); //8
		//to get last cell no.
		short lastcell=sh.getRow(0).getLastCellNum();
		System.out.println(lastcell); //6
	}

}
