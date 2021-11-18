package com.data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class Column_Data {
	public static  void Columndata() throws Throwable {
		File f= new File("C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\EXCEL\\TEST DATA DRIVEN.xlsx");
	   FileInputStream fis = new FileInputStream(f);
	   Workbook w =new XSSFWorkbook(fis);
	   Sheet sheetAt = w.getSheetAt(0);
	   int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	   for (int i = 0; i < numberOfRows; i++) {
		   Row row = sheetAt.getRow(i);
		   Cell cell = row.getCell(1);
		org.apache.poi.ss.usermodel.CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			String cellValue = cell.getStringCellValue();
			System.out.println(cellValue);
			
		}
		else if(cellType.equals(cellType.STRING)) {
			double cellValue = cell.getNumericCellValue();
			int value = (int) cellValue;
		}
	}
	   

	}
	public static void main(String[] args) throws Throwable {
		 Columndata();
	}

}
