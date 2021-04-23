package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {
	public static void main(String[] args) throws Throwable {
		File f = new File("C:\\Users\\Vinoth\\Desktop\\Vinoth\\TestID\\target\\ExcelWrite.xlsx");
		
		// obtaining inputs from a file
			FileInputStream f1 = new FileInputStream(f);
			
			//create workbook
			Workbook w = new XSSFWorkbook(f1);
			
			Sheet s = w.getSheet("Data");
			
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell c = row.getCell(j);
				int cellType = c.getCellType(); // cellType = 0 -- Number or date or 1 -- String values
				
				if (cellType==1) {
					String value = c.getStringCellValue();
					System.out.println(value);
					if (value.equals("Vaishali")) {
						c.setCellValue("Vinoth");
					}
				}
				FileOutputStream o = new FileOutputStream(f);
				w.write(o);
				System.out.println("Done");
			
	}
	}
	}
}
