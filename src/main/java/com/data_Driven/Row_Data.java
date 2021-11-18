package com.data_Driven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Row_Data {
	public static void RowData() throws Throwable{
		File f = new File("C:\\Users\\krbch\\eclipse-workspace\\Oct_30_Mini_Project\\EXCEL\\TEST DATA DRIVEN.xlsx");
	       FileInputStream fis = new FileInputStream(f);
	     Workbook w = new XSSFWorkbook(fis);
	     Sheet sheetAt = w.getSheetAt(0);
	     Row row = sheetAt.getRow(0);
	     int NumberOfRows = sheetAt.getPhysicalNumberOfRows();  
	     for (int i = 0; i < NumberOfRows ; i++) {
	    	 Cell cell = row.getCell(i);
				CellType cellType =cell.getCellType();
				if(cellType.equals(CellType.STRING))
						{
					String celvalue = cell.getStringCellValue();
					System.out.println(celvalue);
					
				}
				else if (cellType.equals(CellType.NUMERIC)) {
					double value =cell.getNumericCellValue();
					System.out.println(value);
				}
				
				}
			}
	public static void main(String[] args) throws Throwable {
		RowData();
	}
	
	
	
	
	
	
	}

	

