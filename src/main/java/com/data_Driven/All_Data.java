package com.data_Driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data {
	public static void AllData() throws Throwable {
		File f = new File("C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\EXCEL\\TEST DATA DRIVEN.xlsx");
       FileInputStream fis = new FileInputStream(f);
     Workbook w = new XSSFWorkbook(fis);
     Sheet sheetAt = w.getSheetAt(0);
     int NumberOfRows = sheetAt.getPhysicalNumberOfRows();  
	for (int i = 0; i < NumberOfRows ; i++) {
		Row row = sheetAt.getRow(i);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			if(cellType.equals(CellType.STRING))
					{
				String value = cell.getStringCellValue();
				System.out.println(value);
				
			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double cellvalue =cell.getNumericCellValue();
				int value =(int) cellvalue;
				System.out.println(value);
			}
		
			}
	
	}		
		
	}
	
	public static void main(String[] args) throws Throwable {
		 AllData();
	}
	
	
	
	
	
	
	}

	
	

