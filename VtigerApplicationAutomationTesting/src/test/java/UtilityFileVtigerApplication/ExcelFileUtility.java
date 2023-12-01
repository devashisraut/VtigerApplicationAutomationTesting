package UtilityFileVtigerApplication;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFileUtility {
	
	public String readStringDataFronExcelFile(String sheetName,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommanData.properties");
		Workbook workbook=WorkbookFactory.create(fis);
		String value=workbook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
				
	}
	
	
	public int readIntegerDataFronExcelFile(String sheetName,int row,int cell) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommanData.properties");
		Workbook workbook=WorkbookFactory.create(fis);
		 int value = Integer.parseInt(workbook.getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue());
		return value;
	}
}
